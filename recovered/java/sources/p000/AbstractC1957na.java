            package p000;

            import android.content.res.Configuration;
            import android.os.LocaleList;
            
            /* JADX INFO: renamed from: na */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1957na {
                /* JADX INFO: renamed from: a */
                public static void m6951a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
/* 1 */             LocaleList locales = configuration.getLocales();
/* 5 */             LocaleList locales2 = configuration2.getLocales();
/* 13 */            if (locales.equals(locales2)) {
/* 22 */                return;
                    }
/* 15 */            configuration3.setLocales(locales2);
/* 20 */            configuration3.locale = configuration2.locale;
                }

                /* JADX INFO: renamed from: b */
                public static h91 m6952b(Configuration configuration) {
/* 9 */             return h91.m4135a(configuration.getLocales().toLanguageTags());
                }

                /* JADX INFO: renamed from: c */
                public static void m6953c(h91 h91Var) {
/* 13 */            LocaleList.setDefault(LocaleList.forLanguageTags(h91Var.f8973a.f9500a.toLanguageTags()));
                }

                /* JADX INFO: renamed from: d */
                public static void m6954d(Configuration configuration, h91 h91Var) {
/* 13 */            configuration.setLocales(LocaleList.forLanguageTags(h91Var.f8973a.f9500a.toLanguageTags()));
                }
            }
