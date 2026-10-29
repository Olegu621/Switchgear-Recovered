            package p000;

            import java.lang.reflect.Field;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class ky2 {

                /* JADX INFO: renamed from: a */
                public final Unsafe f13042a;

                public ky2(Unsafe unsafe) {
/* 4 */             this.f13042a = unsafe;
                }

                /* JADX INFO: renamed from: a */
                public final int m6309a(Class cls) {
/* 3 */             return this.f13042a.arrayBaseOffset(cls);
                }

                /* JADX INFO: renamed from: b */
                public final int m6310b(Class cls) {
/* 3 */             return this.f13042a.arrayIndexScale(cls);
                }

                /* JADX INFO: renamed from: c */
                public abstract boolean mo4043c(Object obj, long j);

                /* JADX INFO: renamed from: d */
                public abstract byte mo4044d(Object obj, long j);

                /* JADX INFO: renamed from: e */
                public abstract double mo4045e(Object obj, long j);

                /* JADX INFO: renamed from: f */
                public abstract float mo4046f(Object obj, long j);

                /* JADX INFO: renamed from: g */
                public final int m6311g(Object obj, long j) {
/* 3 */             return this.f13042a.getInt(obj, j);
                }

                /* JADX INFO: renamed from: h */
                public final long m6312h(Object obj, long j) {
/* 3 */             return this.f13042a.getLong(obj, j);
                }

                /* JADX INFO: renamed from: i */
                public final Object m6313i(Object obj, long j) {
/* 3 */             return this.f13042a.getObject(obj, j);
                }

                /* JADX INFO: renamed from: j */
                public final long m6314j(Field field) {
/* 3 */             return this.f13042a.objectFieldOffset(field);
                }

                /* JADX INFO: renamed from: k */
                public abstract void mo4047k(Object obj, long j, boolean z);

                /* JADX INFO: renamed from: l */
                public abstract void mo4048l(Object obj, long j, byte b);

                /* JADX INFO: renamed from: m */
                public abstract void mo4049m(Object obj, long j, double d);

                /* JADX INFO: renamed from: n */
                public abstract void mo4050n(Object obj, long j, float f);

                /* JADX INFO: renamed from: o */
                public final void m6315o(Object obj, int i, long j) {
/* 3 */             this.f13042a.putInt(obj, j, i);
                }

                /* JADX INFO: renamed from: p */
                public final void m6316p(Object obj, long j, long j2) {
/* 3 */             this.f13042a.putLong(obj, j, j2);
                }

                /* JADX INFO: renamed from: q */
                public final void m6317q(Object obj, long j, Object obj2) {
/* 3 */             this.f13042a.putObject(obj, j, obj2);
                }

                /* JADX INFO: renamed from: r */
                public boolean mo5627r() {
/* 5 */             Unsafe unsafe = this.f13042a;
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
/* 105 */               my2.m6815a(th);
/* 7 */                 return false;
                    }
                }

                /* JADX INFO: renamed from: s */
                public abstract boolean mo4051s();
            }
