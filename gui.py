import tkinter as tk
from tkinter import scrolledtext
from tkinter import font
from PIL import Image, ImageTk, ImageDraw
from tkinter import scrolledtext, END
from test import runTree  # Import the AntlrProcessor class

def create_base_ui_with_output():
    # --- Customizable Size Variables ---
    gui_width = 600
    gui_height = 800
    input_box_height = 16
    output_box_height = 15
    screen_width = 580
    screen_height = 150 # Screen height should be small for the output box to not be larger than it needs to
    corner_radius = 15
    # ----------------------------------

    # Create an instance of the AntlrProcessor
    processor = runTree()

    def submit_text():
        """Handles the Submit button click."""
        input_text = input_box.get("1.0", END).strip()

        if not input_text:
            output_box.config(state=tk.NORMAL)
            output_box.insert(END, "No text entered. Please try again.\n\n")
            output_box.config(state=tk.DISABLED)
            return

        result = processor.process_input(input_text)

        output_box.config(state=tk.NORMAL)
        if result["success"]:
            output_box.insert(END, "Input accepted!\n")
            output_box.insert(END, f"Result:\n{result['result']}\n")
            output_box.insert(END, "--------------------\n")
        else:
            output_box.insert(END, "Input rejected!\n")
            for error in result["errors"]:
                output_box.insert(END, f"{error}\n")
            output_box.insert(END, "--------------------\n")
        output_box.config(state=tk.DISABLED)
        # Removed input_box.delete("1.0", END)

    def create_rounded_rectangle(width, height, corner_radius, color):
        """Creates a PIL Image with a rounded rectangle."""
        image = Image.new("RGBA", (width, height), (0, 0, 0, 0))
        draw = ImageDraw.Draw(image)
        draw.rounded_rectangle((0, 0, width, height), corner_radius, fill=color)
        return ImageTk.PhotoImage(image)

    def clear_output():
        """Clears the output box."""
        output_box.config(state=tk.NORMAL)
        output_box.delete("1.0", END)
        output_box.config(state=tk.DISABLED)

    root = tk.Tk()
    root.title("Game Boy Style GUI")
    root.geometry(f"{gui_width}x{gui_height}")
    root.configure(bg="#545454")

    main_frame = tk.Frame(root, bg="#c6c6c6")
    main_frame.pack(padx=10, pady=10, fill=tk.BOTH, expand=True)

    # Control Buttons and Input Section (Now at the top)
    controls_frame = tk.Frame(main_frame, bg="#c6c6c6")
    controls_frame.pack(fill=tk.BOTH, expand=True, padx=10, pady=(5, 10))

    # Input Box
    input_label = tk.Label(controls_frame, text="Input:", bg="#c6c6c6", font=("Arial", 10))
    input_label.pack(pady=5)
    input_box = tk.Text(controls_frame, height=input_box_height, bg="#ffffff", fg="black", font=("Courier New", 12))
    input_box.pack(fill=tk.BOTH, padx=10, expand=True)

    # Buttons
    button_font = font.Font(family="Arial", size=12, weight="bold")
    button_frame = tk.Frame(controls_frame, bg="#c6c6c6")
    button_frame.pack(fill=tk.X, pady=5)

    submit_button = tk.Button(button_frame, text="Submit", command=submit_text, bg="#90a4ae", font=button_font, borderwidth=3, relief=tk.RAISED, padx=10)
    submit_button.pack(side=tk.LEFT, padx=10, pady=10)
    clear_button = tk.Button(button_frame, text="Clear Output", command=clear_output, bg="#90a4ae", font=button_font, borderwidth=3, relief=tk.RAISED, padx=10)
    clear_button.pack(side=tk.RIGHT, padx=10, pady=10)

    screen_frame = tk.Frame(main_frame, bg="#d2f5f0", borderwidth=0, highlightthickness=0)
    screen_frame.pack(pady=(5, 10), padx=10, fill=tk.BOTH, expand=True)
    screen_frame.pack_propagate(False) # Add this

    screen_bg_img = create_rounded_rectangle(screen_width, screen_height, corner_radius, "#d2f5f0")
    screen_label = tk.Label(screen_frame, image=screen_bg_img, borderwidth=0, highlightthickness=0)
    screen_label.image = screen_bg_img
    screen_label.pack(fill=tk.BOTH, expand=True)

    # Output Box (Simulated Screen)
    output_box = scrolledtext.ScrolledText(screen_label, height=output_box_height, bg="#a9d2ce", fg="black", font=("Courier New", 10), wrap=tk.WORD, state=tk.DISABLED, borderwidth=0, highlightthickness=0)
    output_box.pack(side=tk.LEFT, fill=tk.BOTH, expand=True, padx=5, pady=5)


    # Add Game Boy-style border
    root.resizable(False, False)

    # Run the GUI
    root.mainloop()

if __name__ == "__main__":
    create_base_ui_with_output()