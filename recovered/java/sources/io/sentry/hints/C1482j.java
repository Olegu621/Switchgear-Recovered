            package io.sentry.hints;

            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.android.core.anr.C1172f;
            import io.sentry.cache.tape.InterfaceC1406e;
            import io.sentry.util.InterfaceC1707f;
            import java.io.ByteArrayInputStream;
            import java.io.DataInputStream;
            import java.io.DataOutputStream;
            import java.io.EOFException;
            import java.io.IOException;
            import java.io.OutputStream;
            
            /* JADX INFO: renamed from: io.sentry.hints.j */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1482j implements InterfaceC1406e, InterfaceC1707f, InterfaceC1481i {
                @Override // io.sentry.util.InterfaceC1707f
                /* JADX INFO: renamed from: b */
                public Object mo4803b() {
/* 5 */             return Boolean.valueOf(AbstractC1245n0.m4882j());
                }

                @Override // io.sentry.cache.tape.InterfaceC1406e
                /* JADX INFO: renamed from: c */
                public void mo5132c(Object obj, OutputStream outputStream) throws IOException {
/* 1 */             C1172f c1172f = (C1172f) obj;
/* 5 */             DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
                    try {
/* 8 */                 c1172f.m4773a(dataOutputStream);
/* 11 */                dataOutputStream.flush();
/* 14 */                outputStream.flush();
/* 17 */                dataOutputStream.close();
                    } catch (Throwable th) {
                        try {
/* 22 */                    dataOutputStream.close();
                        } catch (Throwable th2) {
/* 27 */                    th.addSuppressed(th2);
                        }
/* 30 */                throw th;
                    }
                }

                @Override // io.sentry.cache.tape.InterfaceC1406e
                /* JADX INFO: renamed from: d */
                public Object mo5133d(byte[] bArr) throws IOException {
/* 8 */             DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
                    try {
/* 17 */                if (dataInputStream.readShort() == 1) {
/* 19 */                    long j = dataInputStream.readLong();
/* 23 */                    int i = dataInputStream.readInt();
/* 27 */                    if (i >= 0 && i <= 1000) {
/* 34 */                        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
/* 37 */                        for (int i2 = 0; i2 < i; i2++) {
/* 39 */                            String utf = dataInputStream.readUTF();
/* 43 */                            String utf2 = dataInputStream.readUTF();
/* 47 */                            boolean z = dataInputStream.readBoolean();
/* 51 */                            String utf3 = dataInputStream.readUTF();
/* 55 */                            if (z) {
/* 57 */                                utf3 = null;
                                    }
/* 67 */                            stackTraceElementArr[i2] = new StackTraceElement(utf, utf2, utf3, dataInputStream.readInt());
                                }
/* 74 */                        return new C1172f(j, stackTraceElementArr);
                            }
                        }
                    } catch (EOFException unused) {
                    }
/* 11 */            return null;
                }
            }
