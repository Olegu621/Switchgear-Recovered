            package p000;

            import java.io.PrintWriter;
            import java.io.StringWriter;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xq2 extends AbstractC1910m0 {

                /* JADX INFO: renamed from: b */
                public final String f19323b;

                /* JADX INFO: renamed from: c */
                public final String f19324c;

                /* JADX INFO: renamed from: d */
                public final Throwable f19325d;

                public xq2(String str, String str2, Throwable th) {
/* 1 */             str.getClass();
/* 7 */             this.f19323b = str;
/* 9 */             this.f19324c = str2;
/* 11 */            this.f19325d = th;
                }

                @Override // p000.AbstractC1812k
                /* JADX INFO: renamed from: c */
                public final Map mo104c() {
                    String strSubstring;
/* 2 */             String str = this.f19324c;
/* 4 */             if (str != null) {
/* 6 */                 int length = str.length();
/* 12 */                if (length > 2048) {
/* 14 */                    length = 2048;
                        }
/* 15 */                strSubstring = str.substring(0, length);
                    } else {
/* 20 */                strSubstring = null;
                    }
/* 21 */            if (strSubstring == null || strSubstring.length() == 0) {
/* 29 */                strSubstring = "Empty message found";
                    }
/* 33 */            HashMap map = new HashMap();
/* 40 */            map.put("className", this.f19323b);
/* 45 */            map.put("message", strSubstring);
/* 48 */            Throwable th = this.f19325d;
/* 50 */            if (th != null) {
/* 52 */                int i = mn0.f13881p;
/* 56 */                StringWriter stringWriter = new StringWriter();
/* 64 */                th.printStackTrace(new PrintWriter(stringWriter));
/* 67 */                String string = stringWriter.toString();
/* 71 */                string.getClass();
/* 74 */                int length2 = string.length();
/* 80 */                if (length2 > 8192) {
/* 82 */                    length2 = 8192;
                        }
/* 83 */                String strSubstring2 = string.substring(0, length2);
/* 91 */                String name = th.getClass().getName();
/* 95 */                int length3 = name.length();
/* 101 */               if (length3 > 1024) {
/* 103 */                   length3 = 1024;
                        }
/* 104 */               String strSubstring3 = name.substring(0, length3);
/* 110 */               map.put("stackTrace", strSubstring2);
/* 115 */               map.put("exceptionName", strSubstring3);
                    }
/* 118 */           return map;
                }

                @Override // p000.AbstractC1910m0
                /* JADX INFO: renamed from: d */
                public final String mo105d() {
/* 1 */             return "iglu:com.snowplowanalytics.snowplow/diagnostic_error/jsonschema/1-0-0";
                }
            }
