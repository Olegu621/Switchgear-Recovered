            package p000;

            import android.util.JsonReader;
            import android.util.JsonToken;
            import java.io.BufferedReader;
            import java.io.IOException;
            
            /* JADX INFO: renamed from: dg */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0843dg {

                /* JADX INFO: renamed from: a */
                public final long f7171a;

                public C0843dg(long j) {
/* 4 */             this.f7171a = j;
                }

                /* JADX INFO: renamed from: a */
                public static C0843dg m3056a(BufferedReader bufferedReader) throws IOException {
/* 3 */             JsonReader jsonReader = new JsonReader(bufferedReader);
                    try {
/* 6 */                 jsonReader.beginObject();
/* 13 */                while (jsonReader.hasNext()) {
/* 25 */                    if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
/* 33 */                        if (jsonReader.peek() == JsonToken.STRING) {
/* 45 */                            C0843dg c0843dg = new C0843dg(Long.parseLong(jsonReader.nextString()));
/* 48 */                            jsonReader.close();
/* 51 */                            return c0843dg;
                                }
/* 60 */                        C0843dg c0843dg2 = new C0843dg(jsonReader.nextLong());
/* 63 */                        jsonReader.close();
/* 66 */                        return c0843dg2;
                            }
/* 67 */                    jsonReader.skipValue();
                        }
/* 78 */                throw new IOException("Response is missing nextRequestWaitMillis field.");
                    } catch (Throwable th) {
/* 79 */                jsonReader.close();
/* 82 */                throw th;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
                    return (obj instanceof C0843dg) && this.f7171a == ((C0843dg) obj).f7171a;
                }

                public final int hashCode() {
/* 3 */             long j = this.f7171a;
/* 13 */            return ((int) ((j >>> 32) ^ j)) ^ 1000003;
                }

                public final String toString() {
/* 12 */            return fm0.m3787m(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f7171a, "}");
                }
            }
