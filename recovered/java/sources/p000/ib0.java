            package p000;

            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum ib0 {
                NANOSECONDS(TimeUnit.NANOSECONDS),
                /* JADX INFO: Fake field, exist only in values array */
                MICROSECONDS(TimeUnit.MICROSECONDS),
                MILLISECONDS(TimeUnit.MILLISECONDS),
                SECONDS(TimeUnit.SECONDS),
                MINUTES(TimeUnit.MINUTES),
                HOURS(TimeUnit.HOURS),
                DAYS(TimeUnit.DAYS);


                /* JADX INFO: renamed from: a */
                public final TimeUnit f9526a;

                ib0(TimeUnit timeUnit) {
/* 4 */             this.f9526a = timeUnit;
                }
            }
