import tkinter as tk
from tkinter import scrolledtext
from tkinter import font
from tkinter import scrolledtext, END
from test import runTree  # Import the AntlrProcessor class

def create_base_ui_with_output():
    # --- Customizable Size Variables ---
    gui_width = 600
    gui_height = 800
    input_box_height = 16
    output_box_height = 8.2
    corner_radius = 15
    screen_height = output_box_height * 22 # Calculate based on output_box_height
    screen_width = 580
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

    def create_rounded_rectangle(width, height, corner_radius, color, canvas):
        """Creates a rounded rectangle using polygon on canvas."""
        points = [
            (corner_radius, 0),  # top-left
            (width - corner_radius, 0),  # top-right
            (width, corner_radius),  # right-top
            (width, height - corner_radius),  # right-bottom
            (width - corner_radius, height),  # bottom-right
            (corner_radius, height),  # bottom-left
            (0, height - corner_radius),  # left-bottom
            (0, corner_radius)   #left-top
        ]
        return canvas.create_polygon(points, fill=color, smooth=True, width=0)

    def clear_output():
        """Clears the output box."""
        output_box.config(state=tk.NORMAL)
        output_box.delete("1.0", END)
        output_box.config(state=tk.DISABLED)

    root = tk.Tk()
    root.title("GUI")
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
    screen_frame.pack_propagate(False)

    # Create the rounded rectangle background
    canvas = tk.Canvas(screen_frame, bg="#d2f5f0", borderwidth=0, highlightthickness=0, width=screen_width, height=screen_height)
    canvas.pack()
    create_rounded_rectangle(screen_width, screen_height, corner_radius, "#d2f5f0", canvas)


   
    # Output Box (Simulated Screen)
    output_box = scrolledtext.ScrolledText(canvas, height=output_box_height, bg="#a9d2ce", fg="black", font=("Courier New", 10), wrap=tk.WORD, state=tk.DISABLED, borderwidth=0, highlightthickness=0)
    output_box.place(x=5, y=5, width=screen_width - 10, height=screen_height - 10)

    root.resizable(False, False)
    # Run the GUI
    root.mainloop()

if __name__ == "__main__":
    create_base_ui_with_output()