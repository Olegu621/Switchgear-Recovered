            package p000;

            import java.lang.reflect.Field;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class ly2 {

                /* JADX INFO: renamed from: a */
                public final Unsafe f13535a;

                public ly2(Unsafe unsafe) {
/* 4 */             this.f13535a = unsafe;
                }

                /* JADX INFO: renamed from: a */
                public final int m6576a(Class cls) {
/* 3 */             return this.f13535a.arrayBaseOffset(cls);
                }

                /* JADX INFO: renamed from: b */
                public final int m6577b(Class cls) {
/* 3 */             return this.f13535a.arrayIndexScale(cls);
                }

                /* JADX INFO: renamed from: c */
                public abstract boolean mo4394c(Object obj, long j);

                /* JADX INFO: renamed from: d */
                public abstract double mo4395d(Object obj, long j);

                /* JADX INFO: renamed from: e */
                public abstract float mo4396e(Object obj, long j);

                /* JADX INFO: renamed from: f */
                public final int m6578f(Object obj, long j) {
/* 3 */             return this.f13535a.getInt(obj, j);
                }

                /* JADX INFO: renamed from: g */
                public final long m6579g(Object obj, long j) {
/* 3 */             return this.f13535a.getLong(obj, j);
                }

                /* JADX INFO: renamed from: h */
                public final Object m6580h(Object obj, long j) {
/* 3 */             return this.f13535a.getObject(obj, j);
                }

                /* JADX INFO: renamed from: i */
                public final long m6581i(Field field) {
/* 3 */             return this.f13535a.objectFieldOffset(field);
                }

                /* JADX INFO: renamed from: j */
                public abstract void mo4397j(Object obj, long j, boolean z);

                /* JADX INFO: renamed from: k */
                public abstract void mo4398k(Object obj, long j, byte b);

                /* JADX INFO: renamed from: l */
                public abstract void mo4399l(Object obj, long j, double d);

                /* JADX INFO: renamed from: m */
                public abstract void mo4400m(Object obj, long j, float f);

                /* JADX INFO: renamed from: n */
                public final void m6582n(Object obj, int i, long j) {
/* 3 */             this.f13535a.putInt(obj, j, i);
                }

                /* JADX INFO: renamed from: o */
                public final void m6583o(Object obj, long j, long j2) {
/* 3 */             this.f13535a.putLong(obj, j, j2);
                }

                /* JADX INFO: renamed from: p */
                public final void m6584p(Object obj, long j, Object obj2) {
/* 3 */             this.f13535a.putObject(obj, j, obj2);
                }

                /* JADX INFO: renamed from: q */
                public boolean mo5928q() {
/* 5 */             Unsafe unsafe = this.f13535a;
/* 8 */             if (unsafe == null) {
/* 7 */                 return false;
                    }
                    try {
/* 11 */                Class<?> cls = unsafe.getClass();
/* 23 */                cls.getMethod("objectFieldOffset", Field.class);
/* 32 */                cls.getMethod("arrayBaseOffset", Class.class);
/* 41 */                cls.getMethod("arrayIndexScale", Class.class);
/* 46 */                Class cls2 = Long.TYPE;
/* 52 */                cls.getMethod("getInt", Object.class, cls2);
/* 63 */                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
/* 72 */                cls.getMethod("getLong", Object.class, cls2);
/* 81 */                cls.getMethod("putLong", Object.class, cls2, cls2);
/* 90 */                cls.getMethod("getObject", Object.class, cls2);
/* 99 */                cls.getMethod("putObject", Object.class, cls2, Object.class);
/* 102 */               return true;
                    } catch (Throwable th) {
/* 105 */               ny2.m7069a(th);
/* 7 */                 return false;
                    }
                }

                /* JADX INFO: renamed from: r */
                public abstract boolean mo4401r();
            }
