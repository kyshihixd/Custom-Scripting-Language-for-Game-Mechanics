import tkinter as tk
from tkinter import scrolledtext
from tkinter import font
from PIL import Image, ImageTk, ImageDraw
from tkinter import scrolledtext, END
from test import runTree  # Import the AntlrProcessor class


def create_base_ui_with_output():
    # Create an instance of the AntlrProcessor
    processor = runTree()

    def submit_text():
        """Handles the Submit button click."""
        input_text = input_box.get("1.0", END).strip()

        if not input_text:
            output_box.config(state=tk.NORMAL)  # Enable editing temporarily
            output_box.insert(END, "No text entered. Please try again.\n\n")
            output_box.config(state=tk.DISABLED) # Disable editing
            return

        # Process the input using AntlrProcessor
        result = processor.process_input(input_text)

        output_box.config(state=tk.NORMAL)  # Enable editing temporarily
        if result["success"]:
            # Display the parse tree and AST
            output_box.insert(END, "Input accepted!\n")
            output_box.insert(END, f"Result:\n{result['result']}\n")
            output_box.insert(END, "--------------------\n")  # visual separator
        else:
            # Display errors
            output_box.insert(END, "Input rejected!\n")
            for error in result["errors"]:
                output_box.insert(END, f"{error}\n")
            output_box.insert(END, "--------------------\n")
        output_box.config(state=tk.DISABLED) # Disable editing
        input_box.delete("1.0", END)

    def clear_output():
        """Clears the output box."""
        output_box.config(state=tk.NORMAL)  # Enable editing temporarily
        output_box.delete("1.0", END)
        output_box.config(state=tk.DISABLED)  # Disable editing

    def create_rounded_rectangle(width, height, corner_radius, color):
        """Creates a PIL Image with a rounded rectangle."""
        image = Image.new("RGBA", (width, height), (0, 0, 0, 0))
        draw = ImageDraw.Draw(image)
        draw.rounded_rectangle((0, 0, width, height), corner_radius, fill=color)
        return ImageTk.PhotoImage(image)

    root = tk.Tk()
    root.title("Game Boy Style GUI")
    root.geometry("400x600")
    root.configure(bg="#545454")


    # Main frame to contain everything
    main_frame = tk.Frame(root, bg="#c6c6c6")
    main_frame.pack(padx=10, pady=10, fill=tk.BOTH, expand=True)

    # Screen Frame (Output Section)
    screen_frame = tk.Frame(main_frame, bg="#d2f5f0")
    screen_frame.pack(pady=(10, 5), padx=10, fill=tk.BOTH)


    # Rounded corner on the screen
    corner_radius = 15
    screen_width = 380
    screen_height= 300

    screen_bg_img = create_rounded_rectangle(screen_width, screen_height, corner_radius, "#d2f5f0")
    screen_label = tk.Label(screen_frame, image=screen_bg_img, borderwidth=0, highlightthickness=0)
    screen_label.image = screen_bg_img
    screen_label.pack(fill=tk.BOTH)


    # Output Box (Simulated Screen)
    output_box = scrolledtext.ScrolledText(screen_label, height=15, bg="#a9d2ce", fg="black", font=("Courier New", 10), wrap=tk.WORD, state=tk.DISABLED, borderwidth=0, highlightthickness=0)
    output_box.place(x=5, y=5, width=screen_width-10, height=screen_height-10)


    # Control Buttons and Input Section
    controls_frame = tk.Frame(main_frame, bg="#c6c6c6")
    controls_frame.pack(fill=tk.BOTH, expand=True, padx=10, pady=(5, 10))


    # Input Box
    input_label = tk.Label(controls_frame, text="Input:", bg="#c6c6c6", font=("Arial", 10))
    input_label.pack(pady=5)
    input_box = tk.Text(controls_frame, height=8, bg="#ffffff", fg="black", font=("Courier New", 12))
    input_box.pack(fill=tk.BOTH, padx=10)


    # Buttons
    button_font = font.Font(family="Arial", size=12, weight="bold")
    submit_button = tk.Button(controls_frame, text="Submit", command=submit_text, bg="#90a4ae", font=button_font, borderwidth=3, relief=tk.RAISED, padx=10)
    submit_button.pack(side=tk.LEFT, padx=10, pady=10)
    clear_button = tk.Button(controls_frame, text="Clear Output", command=clear_output, bg="#90a4ae", font=button_font, borderwidth=3, relief=tk.RAISED, padx=10)
    clear_button.pack(side=tk.RIGHT, padx=10, pady=10)

    # Add Game Boy-style border
    root.resizable(False, False)


    # Run the GUI
    root.mainloop()


if __name__ == "__main__":
    create_base_ui_with_output()
