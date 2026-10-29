            package p000;

            import com.google.android.gms.common.data.DataHolder;
            import com.google.android.gms.drive.UserMetadata;
            import java.util.Arrays;
            import java.util.Collections;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qr3 extends jm3 {
                public qr3(String str) {
/* 44 */            super(str, Arrays.asList(m8007a(str, "permissionId"), m8007a(str, "displayName"), m8007a(str, "picture"), m8007a(str, "isAuthenticatedUser"), m8007a(str, "emailAddress")), Collections.EMPTY_LIST, 6000000);
                }

                /* JADX INFO: renamed from: a */
                public static String m8007a(String str, String str2) {
/* 18 */            StringBuilder sb = new StringBuilder(str2.length() + String.valueOf(str).length() + 1);
/* 21 */            sb.append(str);
/* 26 */            sb.append(".");
/* 29 */            sb.append(str2);
/* 32 */            return sb.toString();
                }

                /* JADX INFO: renamed from: b */
                public final String m8008b(String str) {
/* 5 */             return m8007a(getName(), str);
                }

                @Override // p000.sc3
                public final boolean zzb(DataHolder dataHolder, int i, int i2) {
/* 13 */            if (!dataHolder.f3465c.containsKey(m8008b("permissionId"))) {
/* 40 */                return false;
                    }
/* 15 */            String strM8008b = m8008b("permissionId");
/* 19 */            dataHolder.m2017I1(i, strM8008b);
                    return !dataHolder.f3466d[i2].isNull(i, dataHolder.f3465c.getInt(strM8008b));
                }

                @Override // p000.sc3
                public final /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
/* 7 */             String strM2015G1 = dataHolder.m2015G1(i, i2, m8008b("permissionId"));
/* 11 */            if (strM2015G1 == null) {
/* 59 */                return null;
                    }
/* 55 */            return new UserMetadata(dataHolder.m2012D1(i, i2, m8008b("isAuthenticatedUser")), strM2015G1, dataHolder.m2015G1(i, i2, m8008b("displayName")), dataHolder.m2015G1(i, i2, m8008b("picture")), dataHolder.m2015G1(i, i2, m8008b("emailAddress")));
                }
            }
