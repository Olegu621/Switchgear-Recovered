            package p000;

            import java.util.Calendar;
            import java.util.Date;
            import java.util.TimeZone;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 62 */    public final class h50 {
                public static final f50 Companion = new f50();

                /* JADX INFO: renamed from: c */
                public static final TimeZone f8896c = TimeZone.getTimeZone("UTC");

                /* JADX INFO: renamed from: d */
                public static final hk2 f8897d;

                /* JADX INFO: renamed from: a */
                public final hk2 f8898a;

                /* JADX INFO: renamed from: b */
                public final Calendar f8899b;

                static {
/* 18 */            r51.m8065b(C2498yh.f19619d);
/* 27 */            f8897d = r51.m8065b(C2498yh.f19617c);
                }

                public h50(Calendar calendar) {
/* 10 */            r51.m8065b(new g50(this, 5));
/* 19 */            r51.m8065b(new g50(this, 3));
/* 32 */            this.f8898a = r51.m8065b(new g50(this, 0));
/* 40 */            r51.m8065b(new g50(this, 1));
/* 49 */            r51.m8065b(new g50(this, 2));
/* 58 */            r51.m8065b(new g50(this, 4));
/* 61 */            this.f8899b = calendar;
                }

                /* JADX INFO: renamed from: a */
                public final h50 m4113a(int i, int i2) {
/* 1 */             Calendar calendar = Calendar.getInstance();
/* 11 */            calendar.setTime(this.f8899b.getTime());
/* 14 */            calendar.add(i, i2);
/* 19 */            return new h50(calendar);
                }

                /* JADX INFO: renamed from: b */
                public final h50 m4114b() {
/* 3 */             Calendar calendar = Calendar.getInstance(f8896c);
/* 13 */            calendar.setTime(this.f8899b.getTime());
/* 19 */            calendar.set(11, 0);
/* 24 */            calendar.set(12, 0);
/* 29 */            calendar.set(13, 0);
/* 34 */            calendar.set(14, 0);
/* 39 */            return new h50(calendar);
                }

                /* JADX INFO: renamed from: c */
                public final long m4115c() {
/* 7 */             return this.f8899b.getTime().getTime();
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 20 */            if (!h50.class.equals(obj != null ? obj.getClass() : null)) {
/* 19 */                return false;
                    }
/* 23 */            obj.getClass();
                    return m4115c() == ((h50) obj).m4115c();
                }

                public final int hashCode() {
/* 5 */             return Long.hashCode(m4115c());
                }

/* 63 */        public h50(long j) {
/* 65 */            Companion.getClass();
/* 66 */            Date date = new Date(j);
/* 68 */            Calendar calendar = Calendar.getInstance(f8896c);
/* 69 */            calendar.setTime(date);
/* 70 */            this(calendar);
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 70 */        public h50() {
/* 72 */            Companion.getClass();
/* 74 */            Calendar calendar = Calendar.getInstance(f8896c);
                    calendar.getClass();
/* 75 */            this(calendar);
                }
            }
