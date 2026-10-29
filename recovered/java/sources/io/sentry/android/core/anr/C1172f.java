            package io.sentry.android.core.anr;

            import io.sentry.util.AbstractC1716o;
            import java.io.DataOutputStream;
            import java.io.IOException;
            import java.nio.charset.Charset;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: io.sentry.android.core.anr.f */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1172f implements Comparable {

                /* JADX INFO: renamed from: a */
                public final StackTraceElement[] f9961a;

                /* JADX INFO: renamed from: b */
                public final long f9962b;

                public C1172f(long j, StackTraceElement[] stackTraceElementArr) {
/* 4 */             this.f9962b = j;
/* 6 */             this.f9961a = stackTraceElementArr;
                }

                /* JADX INFO: renamed from: a */
                public final void m4773a(DataOutputStream dataOutputStream) throws IOException {
/* 2 */             dataOutputStream.writeShort(1);
/* 7 */             dataOutputStream.writeLong(this.f9962b);
/* 10 */            StackTraceElement[] stackTraceElementArr = this.f9961a;
/* 13 */            dataOutputStream.writeInt(stackTraceElementArr.length);
/* 19 */            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
/* 23 */                String className = stackTraceElement.getClassName();
/* 27 */                Charset charset = AbstractC1716o.f11743a;
/* 29 */                String str = HttpUrl.FRAGMENT_ENCODE_SET;
/* 31 */                if (className == null) {
/* 33 */                    className = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 34 */                dataOutputStream.writeUTF(className);
/* 37 */                String methodName = stackTraceElement.getMethodName();
/* 41 */                if (methodName == null) {
/* 43 */                    methodName = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 44 */                dataOutputStream.writeUTF(methodName);
/* 47 */                String fileName = stackTraceElement.getFileName();
/* 56 */                dataOutputStream.writeBoolean(fileName == null);
/* 59 */                if (fileName != null) {
/* 62 */                    str = fileName;
                        }
/* 63 */                dataOutputStream.writeUTF(str);
/* 70 */                dataOutputStream.writeInt(stackTraceElement.getLineNumber());
                    }
                }

                @Override // java.lang.Comparable
                public final int compareTo(Object obj) {
/* 7 */             return Long.compare(this.f9962b, ((C1172f) obj).f9962b);
                }
            }
