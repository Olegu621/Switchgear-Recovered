            package p000;

            import android.util.Base64;
            import java.util.HashMap;
            import java.util.Map;
            import kotlin.text.Charsets;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zq2 {

                /* JADX INFO: renamed from: a */
                public final String f20293a = zq2.class.getSimpleName();

                /* JADX INFO: renamed from: b */
                public final HashMap f20294b = new HashMap();

                /* JADX INFO: renamed from: a */
                public final void m10420a(String str, String str2) {
/* 1 */             HashMap map = this.f20294b;
/* 3 */             String str3 = this.f20293a;
/* 5 */             if (str2 == null || str2.length() == 0) {
/* 39 */                k50.m5958L(str3, "The keys value is empty, removing the key: %s", str);
/* 42 */                map.remove(str);
                    } else {
/* 26 */                k50.m5958L(str3, fm0.m3784j("Adding new kv pair: ", str, "->%s"), str2);
/* 29 */                map.put(str, str2);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m10421b(HashMap map, boolean z, String str, String str2) {
/* 1 */             map.getClass();
/* 9 */             String string = new JSONObject(map).toString();
/* 13 */            string.getClass();
/* 24 */            k50.m5958L(this.f20293a, "Adding new map: %s", map);
/* 27 */            if (!z) {
/* 52 */                m10420a(str2, string);
/* 55 */                return;
                    }
/* 29 */            int i = mn0.f13881p;
/* 33 */            byte[] bytes = string.getBytes(Charsets.UTF_8);
/* 37 */            bytes.getClass();
/* 41 */            String strEncodeToString = Base64.encodeToString(bytes, 2);
/* 45 */            strEncodeToString.getClass();
/* 48 */            m10420a(str, strEncodeToString);
                }

                /* JADX INFO: renamed from: c */
                public final void m10422c(Map map) {
/* 7 */             String str = this.f20293a;
/* 9 */             k50.m5958L(str, "Adding new map: %s", map);
/* 24 */            for (Map.Entry entry : map.entrySet()) {
/* 36 */                String str2 = (String) entry.getKey();
/* 38 */                Object value = entry.getValue();
/* 42 */                str2.getClass();
/* 45 */                HashMap map2 = this.f20294b;
/* 47 */                if (value == null) {
/* 55 */                    k50.m5958L(str, "The value is empty, removing the key: %s", str2);
/* 58 */                    map2.remove(str2);
                        } else {
/* 74 */                    k50.m5958L(str, fm0.m3784j("Adding new kv pair: ", str2, "->%s"), value);
/* 77 */                    map2.put(str2, value);
                        }
                    }
                }

                /* JADX INFO: renamed from: d */
                public final long m10423d() {
                    long j;
/* 1 */             String string = toString();
/* 5 */             int i = mn0.f13881p;
/* 7 */             string.getClass();
/* 10 */            long j2 = 0;
/* 12 */            int i2 = 0;
/* 17 */            while (i2 < string.length()) {
/* 19 */                char cCharAt = string.charAt(i2);
/* 25 */                if (cCharAt <= 127) {
/* 27 */                    j = 1;
                        } else if (cCharAt <= 2047) {
/* 35 */                    j = 2;
                        } else {
/* 43 */                    if (55296 <= cCharAt && cCharAt < 57344) {
/* 50 */                        j2 += 4;
/* 51 */                        i2++;
                            } else if (cCharAt < 65535) {
/* 59 */                        j = 3;
                            } else {
/* 62 */                        j2 += 4;
                            }
/* 63 */                    i2++;
                        }
/* 29 */                j2 += j;
/* 63 */                i2++;
                    }
/* 66 */            return j2;
                }

                public final String toString() {
/* 3 */             HashMap map = this.f20294b;
/* 5 */             map.getClass();
/* 11 */            String string = new JSONObject(map).toString();
/* 15 */            string.getClass();
/* 18 */            return string;
                }
            }
