package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSFileHandle;
import static ns.NSFileHandle.*;
import ns.INSFileHandle;
import static ns.INSFileHandle.*;

import ns.NSPipe;

public abstract class INSPipe_posix extends NSPipe {

	protected NSFileHandle _fileHandleForReading;
	protected NSFileHandle _fileHandleForWriting;

}
