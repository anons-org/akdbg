package constans.meta;

public class Source {
    /** The short name of the source. Every source returned from the debug adapter has a name.
     When sending a source to the debug adapter this name is optional.
     */

    String name;
    /** The path of the source to be shown in the UI.
     It is only used to locate and load the content of the source if no `sourceReference` is specified (or its value is 0).
     */

    String path;
    /** If the value > 0 the contents of the source must be retrieved through the `source` request (even if a path is specified).
     Since a `sourceReference` is only valid for a session, it can not be used to persist a source.
     The value should be less than or equal to 2147483647 (2^31-1).
     */

    int  sourceReference;
    /** A hint for how to present the source in the UI.
     A value of `deemphasize` can be used to indicate that the source is not available or that it is skipped on stepping.
     */

    String presentationHint;


    /** The origin of this source. For example, 'internal module', 'inlined content from source map', etc. */

    String origin;

    /** A list of sources that are related to this source. These may be the source that generated this source. */

    Source[] sources;

    /** Additional data that a debug adapter might want to loop through the client.
     The client should leave the data intact and persist it across sessions. The client should not interpret the data.
     */


    Object adapterData;


    /** The checksums associated with this file. */

    Checksum[] checksums ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getSourceReference() {
        return sourceReference;
    }

    public void setSourceReference(int sourceReference) {
        this.sourceReference = sourceReference;
    }

    public String getPresentationHint() {
        return presentationHint;
    }

    public void setPresentationHint(String presentationHint) {
        this.presentationHint = presentationHint;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Source[] getSources() {
        return sources;
    }

    public void setSources(Source[] sources) {
        this.sources = sources;
    }

    public Object getAdapterData() {
        return adapterData;
    }

    public void setAdapterData(Object adapterData) {
        this.adapterData = adapterData;
    }

    public Checksum[] getChecksums() {
        return checksums;
    }

    public void setChecksums(Checksum[] checksums) {
        this.checksums = checksums;
    }
}
