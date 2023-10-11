package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.PREFIX_MODULE;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.module.Module;

/**
 * Adds a module to the address book.
 */
public class AddModuleCommand extends Command {
    public static final String COMMAND_WORD = "addModule";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Adds a module to the list\n"
            + "Parameters: "
            + PREFIX_MODULE + "MODULE";

    public static final String MESSAGE_SUCCESS = "New module added: %s";

    public static final String MESSAGE_DUPLICATE_MODULE = "This module already exists in the address book";

    private Module toAdd;

    /**
     * Creates an AddCommand to add the specified {@code Person}
     */
    public AddModuleCommand(Module module) {
        requireNonNull(module);
        toAdd = module;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);

        if (model.hasModule(toAdd)) {
            throw new CommandException(MESSAGE_DUPLICATE_MODULE);
        }

        model.addModule(toAdd);
        return new CommandResult(String.format(MESSAGE_SUCCESS, toAdd));
    }
}