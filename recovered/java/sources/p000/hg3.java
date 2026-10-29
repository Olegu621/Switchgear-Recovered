            package p000;

            import com.google.android.gms.internal.drive.zzhs;
            import com.google.android.gms.internal.drive.zzid;
            import com.google.android.gms.internal.drive.zzif;
            import com.google.android.gms.internal.drive.zzin;
            import io.sentry.C1697u2;
            import java.util.HashMap;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class hg3 {

                /* JADX INFO: renamed from: a */
                public static final HashMap f9074a = new HashMap();

                /* JADX INFO: renamed from: b */
                public static final HashMap f9075b = new HashMap();

                static {
/* 17 */            m4225b(zzhs.zzjl);
/* 22 */            m4225b(zzhs.zzkr);
/* 27 */            m4225b(zzhs.zzki);
/* 32 */            m4225b(zzhs.zzkp);
/* 37 */            m4225b(zzhs.zzks);
/* 42 */            m4225b(zzhs.zzjy);
/* 47 */            m4225b(zzhs.zzjx);
/* 52 */            m4225b(zzhs.zzjz);
/* 57 */            m4225b(zzhs.zzka);
/* 62 */            m4225b(zzhs.zzkb);
/* 67 */            m4225b(zzhs.zzjv);
/* 72 */            m4225b(zzhs.zzkd);
/* 77 */            m4225b(zzhs.zzke);
/* 82 */            m4225b(zzhs.zzkf);
/* 87 */            m4225b(zzhs.zzkn);
/* 92 */            m4225b(zzhs.zzjm);
/* 97 */            m4225b(zzhs.zzkk);
/* 102 */           m4225b(zzhs.zzjo);
/* 107 */           m4225b(zzhs.zzjw);
/* 112 */           m4225b(zzhs.zzjp);
/* 117 */           m4225b(zzhs.zzjq);
/* 122 */           m4225b(zzhs.zzjr);
/* 127 */           m4225b(zzhs.zzjs);
/* 132 */           m4225b(zzhs.zzkh);
/* 137 */           m4225b(zzhs.zzkc);
/* 142 */           m4225b(zzhs.zzkj);
/* 147 */           m4225b(zzhs.zzkl);
/* 152 */           m4225b(zzhs.zzkm);
/* 157 */           m4225b(zzhs.zzko);
/* 162 */           m4225b(zzhs.zzkt);
/* 167 */           m4225b(zzhs.zzku);
/* 172 */           m4225b(zzhs.zzju);
/* 177 */           m4225b(zzhs.zzjt);
/* 182 */           m4225b(zzhs.zzkq);
/* 187 */           m4225b(zzhs.zzkg);
/* 192 */           m4225b(zzhs.zzjn);
/* 197 */           m4225b(zzhs.zzkv);
/* 202 */           m4225b(zzhs.zzkw);
/* 207 */           m4225b(zzhs.zzkx);
/* 212 */           m4225b(zzhs.zzky);
/* 217 */           m4225b(zzhs.zzkz);
/* 222 */           m4225b(zzhs.zzla);
/* 227 */           m4225b(zzhs.zzlb);
/* 232 */           m4225b(zzif.zzld);
/* 237 */           m4225b(zzif.zzlf);
/* 242 */           m4225b(zzif.zzlg);
/* 247 */           m4225b(zzif.zzlh);
/* 252 */           m4225b(zzif.zzle);
/* 257 */           m4225b(zzif.zzli);
/* 262 */           m4225b(zzin.zzlk);
/* 267 */           m4225b(zzin.zzll);
/* 272 */           m4224a(go3.f8755a);
/* 277 */           m4224a(zzid.zzlc);
                }

                /* JADX INFO: renamed from: a */
                public static void m4224a(zg3 zg3Var) {
/* 11 */            if (f9075b.put(zg3Var.zzbd(), zg3Var) == null) {
/* 13 */                return;
                    }
/* 14 */            String strZzbd = zg3Var.zzbd();
/* 32 */            C1697u2.m5434j(String.valueOf(strZzbd).length() + 46, "A cleaner for key ", strZzbd, " has already been registered");
                }

                /* JADX INFO: renamed from: b */
                public static void m4225b(ii1 ii1Var) {
/* 1 */             String name = ii1Var.getName();
/* 5 */             HashMap map = f9074a;
/* 11 */            if (map.containsKey(name)) {
/* 19 */                String strValueOf = String.valueOf(ii1Var.getName());
/* 44 */                throw new IllegalArgumentException(strValueOf.length() != 0 ? "Duplicate field name registered: ".concat(strValueOf) : new String("Duplicate field name registered: "));
                    }
/* 49 */            map.put(ii1Var.getName(), ii1Var);
                }
            }
