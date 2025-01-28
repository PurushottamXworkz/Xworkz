package com.xworkz.library.service;

import com.xworkz.library.dto.LibraryDto;

public abstract class LibraryService {

	public abstract String validateAndSave(LibraryDto dto);
}
