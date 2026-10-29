            package io.sentry.android.replay;

            import io.sentry.C1554m6;
            import io.sentry.C1576o6;
            import io.sentry.EnumC1553m5;
            import io.sentry.android.replay.capture.C1305g;
            import io.sentry.android.replay.capture.C1308j;
            import java.io.File;
            import java.io.Serializable;
            import kotlin.jvm.functions.Function1;
            import p000.b51;
            import p000.e22;
            import p000.h22;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.j */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1325j extends b51 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10546a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ long f10547b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f10548c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Serializable f10549d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C1325j(long j, Object obj, Serializable serializable, int i) {
/* 10 */            super(1);
/* 1 */             this.f10546a = i;
/* 3 */             this.f10547b = j;
/* 5 */             this.f10548c = obj;
/* 7 */             this.f10549d = serializable;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 1 */             int i = this.f10546a;
/* 3 */             Serializable serializable = this.f10549d;
/* 5 */             long j = this.f10547b;
/* 7 */             Object obj2 = this.f10548c;
                    switch (i) {
                        case 0:
/* 102 */                   C1327l c1327l = (C1327l) obj;
/* 104 */                   c1327l.getClass();
/* 111 */                   if (c1327l.f10562b < j) {
/* 117 */                       ((C1326k) obj2).m5014f(c1327l.f10561a);
/* 120 */                       return Boolean.TRUE;
                            }
/* 123 */                   h22 h22Var = (h22) serializable;
/* 127 */                   if (h22Var.f8873a == null) {
/* 131 */                       h22Var.f8873a = c1327l.f10563c;
                            }
/* 133 */                   return Boolean.FALSE;
                        default:
/* 12 */                    C1308j c1308j = (C1308j) obj;
/* 14 */                    C1305g c1305g = (C1305g) obj2;
/* 16 */                    c1308j.getClass();
/* 19 */                    C1576o6 c1576o6 = c1308j.f10493a;
/* 29 */                    if (c1576o6.f11214f0.getTime() >= j) {
/* 99 */                        return Boolean.FALSE;
                            }
/* 37 */                    c1305g.m4994k(c1305g.m4988e() - 1);
/* 40 */                    File file = c1576o6.f11209a0;
/* 44 */                    C1554m6 c1554m6 = c1305g.f10488t;
/* 46 */                    if (file != null) {
                                try {
/* 53 */                            if (!file.delete()) {
/* 69 */                                c1554m6.getLogger().mo4672k(EnumC1553m5.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
                                    }
                                } catch (Throwable th) {
/* 88 */                            c1554m6.getLogger().mo4670b(EnumC1553m5.ERROR, th, "Failed to delete replay segment: %s", file.getAbsolutePath());
                                }
                                break;
                            }
/* 94 */                    ((e22) serializable).f7490a = true;
/* 96 */                    return Boolean.TRUE;
                    }
                }
            }
