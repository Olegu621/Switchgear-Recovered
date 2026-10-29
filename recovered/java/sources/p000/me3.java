            package p000;

            import java.util.Calendar;
            import java.util.Locale;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class me3 extends hk3 {

                /* JADX INFO: renamed from: c */
                public long f13709c;

                /* JADX INFO: renamed from: d */
                public String f13710d;

                @Override // p000.hk3
                /* JADX INFO: renamed from: A */
                public final boolean mo1364A() {
/* 1 */             Calendar calendar = Calendar.getInstance();
/* 23 */            this.f13709c = ((long) (calendar.get(16) + calendar.get(15))) / 60000;
/* 25 */            Locale locale = Locale.getDefault();
/* 29 */            String language = locale.getLanguage();
/* 33 */            Locale locale2 = Locale.ENGLISH;
/* 35 */            String lowerCase = language.toLowerCase(locale2);
/* 43 */            String lowerCase2 = locale.getCountry().toLowerCase(locale2);
/* 77 */            this.f13710d = fm0.m3790p(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
/* 79 */            return false;
                }

                /* JADX INFO: renamed from: D */
                public final long m6641D() {
/* 1 */             m4240B();
/* 4 */             return this.f13709c;
                }

                /* JADX INFO: renamed from: E */
                public final String m6642E() {
/* 1 */             m4240B();
/* 4 */             return this.f13710d;
                }
            }
