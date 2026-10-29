            package p000;

            import com.quago.mobile.sdk.QuagoSettings;
            import com.supercell.titan.QuagoManager;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.util.zip.GZIPOutputStream;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class d02 implements QuagoSettings.QuagoCallback {
                @Override // com.quago.mobile.sdk.QuagoSettings.QuagoCallback
                public final void onJsonSegment(String str, String str2) {
                    try {
/* 7 */                 ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str2.length());
/* 12 */                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
/* 19 */                gZIPOutputStream.write(str2.getBytes());
/* 22 */                gZIPOutputStream.close();
/* 25 */                byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 29 */                byteArrayOutputStream.close();
/* 32 */                QuagoManager.sendJsonSegments(str, byteArray);
                    } catch (IOException unused) {
                    }
                }
            }
