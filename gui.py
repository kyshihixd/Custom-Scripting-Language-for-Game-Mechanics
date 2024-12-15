from tkinter import Tk, Text, Button, Label, scrolledtext, END
from test import runTree  # Import the AntlrProcessor class


def create_base_ui_with_output():
    # Create an instance of the AntlrProcessor
    processor = runTree()

    def submit_text():
        """Handles the Submit button click."""
        input_text = input_box.get("1.0", END).strip()

        if not input_text:
            output_box.insert(END, "No text entered. Please try again.\n\n")
            return

        # Process the input using AntlrProcessor
        result = processor.process_input(input_text)

        if result["success"]:
            # Display the parse tree and AST
            output_box.insert(END, "Input accepted!\n")
            output_box.insert(END, f"Parse Tree:\n{result['parse_tree']}\n\n")
            output_box.insert(END, f"AST:\n{result['ast']}\n\n")
            output_box.insert(END, f"Result:\n{result['result']}\n\n")
        else:
            # Display errors
            output_box.insert(END, "Input rejected!\n")
            for error in result["errors"]:
                output_box.insert(END, f"{error}\n")
        input_box.delete("1.0", END)

    def clear_output():
        """Clears the output box."""
        output_box.delete("1.0", END)

    # Create the main window
    root = Tk()
    root.title("ANTLR GUI Example")

    # Input Box
    Label(root, text="Enter your text below:").pack(pady=5)
    input_box = Text(root, height=5, width=60)
    input_box.pack(pady=5)

    # Buttons
    Button(root, text="Submit", command=submit_text).pack(pady=5)
    Button(root, text="Clear Output", command=clear_output).pack(pady=5)

    # Output Box
    Label(root, text="Output:").pack(pady=5)
    output_box = scrolledtext.ScrolledText(root, height=10, width=70)
    output_box.pack(pady=5)

    # Run the GUI
    root.mainloop()


if __name__ == "__main__":
    create_base_ui_with_output()
