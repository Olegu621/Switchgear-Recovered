            package p000;

            import java.text.SimpleDateFormat;
            import java.util.Date;
            import java.util.Locale;
            import java.util.TimeZone;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class h11 implements s13 {

                /* JADX INFO: renamed from: a */
                public static final SimpleDateFormat f8865a;

                static {
/* 7 */             SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
/* 10 */            f8865a = simpleDateFormat;
/* 18 */            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                }

                @Override // p000.td0
                /* JADX INFO: renamed from: a */
                public final void mo3633a(Object obj, Object obj2) {
/* 11 */            ((t13) obj2).mo4052b(f8865a.format((Date) obj));
                }
            }
