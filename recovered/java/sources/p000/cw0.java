            package p000;

            import android.graphics.Bitmap;
            import android.graphics.BitmapFactory;
            import android.util.Log;
            import com.google.android.gms.tasks.Task;
            import java.io.Closeable;
            import java.io.IOException;
            import java.io.InputStream;
            import java.net.URL;
            import java.net.URLConnection;
            import java.util.Objects;
            import java.util.concurrent.Future;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cw0 implements Closeable {

                /* JADX INFO: renamed from: a */
                public final URL f6921a;

                /* JADX INFO: renamed from: b */
                public volatile Future f6922b;

                /* JADX INFO: renamed from: c */
                public Task f6923c;

                public cw0(URL url) {
/* 4 */             this.f6921a = url;
                }

                /* JADX INFO: renamed from: c */
                public final Bitmap m2896c() throws IOException {
/* 4 */             boolean zIsLoggable = Log.isLoggable("FirebaseMessaging", 4);
/* 8 */             URL url = this.f6921a;
/* 10 */            if (zIsLoggable) {
/* 12 */                Objects.toString(url);
                    }
/* 15 */            URLConnection uRLConnectionOpenConnection = url.openConnection();
/* 26 */            if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
/* 118 */               ds0.m3195l("Content-Length exceeds max size of 1048576");
/* 23 */                return null;
                    }
/* 28 */            InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
                    try {
/* 37 */                byte[] bArrM6678B = mn0.m6678B(new C2074pl(inputStream));
/* 41 */                if (inputStream != null) {
/* 43 */                    inputStream.close();
                        }
/* 51 */                if (Log.isLoggable("FirebaseMessaging", 2)) {
/* 53 */                    Objects.toString(url);
                        }
/* 57 */                if (bArrM6678B.length > 1048576) {
/* 100 */                   ds0.m3195l("Image exceeds max size of 1048576");
/* 23 */                    return null;
                        }
/* 61 */                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM6678B, 0, bArrM6678B.length);
/* 65 */                if (bitmapDecodeByteArray != null) {
/* 72 */                    if (Log.isLoggable("FirebaseMessaging", 3)) {
/* 74 */                        Objects.toString(url);
                            }
/* 77 */                    return bitmapDecodeByteArray;
                        }
/* 97 */                throw new IOException("Failed to decode image: " + url);
                    } catch (Throwable th) {
/* 105 */               if (inputStream != null) {
                            try {
/* 107 */                       inputStream.close();
                            } catch (Throwable th2) {
/* 112 */                       th.addSuppressed(th2);
                            }
                        }
/* 115 */               throw th;
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 4 */             this.f6922b.cancel(true);
                }
            }
