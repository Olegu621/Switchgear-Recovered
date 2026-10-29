            package com.supercell.p007id.scid_plugin;

            import android.content.Context;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedAccountStorage;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            import p000.C2122qw;
            import p000.c10;
            import p000.f42;
            import p000.gb1;
            import p000.i13;
            import p000.kt0;
            import p000.m60;
            import p000.nd0;
            import p000.pg3;
            import p000.tj2;
            import p000.ws1;
            import p000.xs1;
            import p000.y10;
            import p000.z10;
            import p000.z80;
            
            /* JADX INFO: renamed from: com.supercell.id.scid_plugin.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0783b extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public int f5696a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PlatformInterfacePlugin f5697b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f5698c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ String f5699d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ List f5700e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ MethodChannel.Result f5701f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0783b(PlatformInterfacePlugin platformInterfacePlugin, String str, String str2, List list, MethodChannel.Result result, c10 c10Var) {
/* 12 */            super(2, c10Var);
/* 1 */             this.f5697b = platformInterfacePlugin;
/* 3 */             this.f5698c = str;
/* 5 */             this.f5699d = str2;
/* 7 */             this.f5700e = list;
/* 9 */             this.f5701f = result;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 14 */            return new C0783b(this.f5697b, this.f5698c, this.f5699d, this.f5700e, this.f5701f, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((C0783b) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
                
                    if (p000.i13.m4422D(r1, r4, r9) == r0) goto L30;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v2, types: [com.supercell.id.scid_plugin.platform_interface.SharedAccountStorage] */
                /* JADX WARN: Type inference failed for: r6v1, types: [nd0] */
                /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    ?? arrayList;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.f5696a;
/* 5 */             MethodChannel.Result result = this.f5701f;
                    try {
/* 10 */                if (i == 0) {
/* 33 */                    pg3.m7417A(obj);
/* 1 */                     Context context = this.f5697b.applicationContext;
/* 44 */                    if (context == null) {
/* 119 */                       Intrinsics.m6220e("applicationContext");
/* 122 */                       throw null;
                            }
/* 50 */                    ?? sharedAccountStorage = new SharedAccountStorage(context, this.f5698c, this.f5699d);
/* 53 */                    List list = this.f5700e;
/* 55 */                    if (list != null) {
/* 65 */                        arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 68 */                        Iterator it = list.iterator();
/* 76 */                        while (it.hasNext()) {
/* 90 */                            arrayList.add(IdAccount.INSTANCE.fromMap((Map) it.next()));
                                }
                            } else {
/* 94 */                        arrayList = nd0.f14189a;
                            }
/* 96 */                    sharedAccountStorage.saveAccounts(arrayList);
/* 99 */                    m60 m60Var = z80.f19975a;
/* 101 */                   kt0 kt0Var = gb1.f8531a;
/* 105 */                   ws1 ws1Var = new ws1(result, null);
/* 108 */                   this.f5696a = 1;
/* 114 */                   if (i13.m4422D(kt0Var, ws1Var, this) == z10Var) {
/* 140 */                       return z10Var;
                            }
                        } else {
/* 12 */                    if (i != 1 && i != 2) {
/* 23 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 16 */                    pg3.m7417A(obj);
                        }
                    } catch (Exception e) {
/* 123 */               m60 m60Var2 = z80.f19975a;
/* 125 */               kt0 kt0Var2 = gb1.f8531a;
/* 129 */               xs1 xs1Var = new xs1(result, e, null);
/* 132 */               this.f5696a = 2;
                    }
/* 141 */           return Unit.f12910a;
                }
            }
