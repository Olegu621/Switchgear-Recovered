            package org.chromium.support_lib_boundary;

            import android.content.ContentProvider;
            import android.database.Cursor;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.ParcelFileDescriptor;
            import java.io.FileNotFoundException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public interface DropDataContentProviderBoundaryInterface {
                Uri cache(byte[] bArr, String str, String str2);

                Bundle call(String str, String str2, Bundle bundle);

                String[] getStreamTypes(Uri uri, String str);

                String getType(Uri uri);

                boolean onCreate();

                void onDragEnd(boolean z);

                ParcelFileDescriptor openFile(ContentProvider contentProvider, Uri uri) throws FileNotFoundException;

                Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

                void setClearCachedDataIntervalMs(int i);
            }
