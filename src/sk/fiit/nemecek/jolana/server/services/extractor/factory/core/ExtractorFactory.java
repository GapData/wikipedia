package sk.fiit.nemecek.jolana.server.services.extractor.factory.core;

import java.io.File;
/**
 * Factory interface
 * @author Tom� Neme�ek
 *
 */
public interface ExtractorFactory {

    public String getInstance(File file) throws Exception;
}
