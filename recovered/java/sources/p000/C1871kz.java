            package p000;

            import com.usercentrics.sdk.p009v2.consent.data.SaveConsentsData;
            import com.usercentrics.sdk.services.deviceStorage.models.ConsentsBuffer;
            import com.usercentrics.sdk.services.deviceStorage.models.ConsentsBufferEntry;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: renamed from: kz */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1871kz extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13043a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1945mz f13044b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ SaveConsentsData f13045c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C1871kz(C1945mz c1945mz, SaveConsentsData saveConsentsData, c10 c10Var, int i) {
/* 8 */             super(2, c10Var);
/* 1 */             this.f13043a = i;
/* 3 */             this.f13044b = c1945mz;
/* 5 */             this.f13045c = saveConsentsData;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 1 */             int i = this.f13043a;
/* 3 */             SaveConsentsData saveConsentsData = this.f13045c;
/* 5 */             C1945mz c1945mz = this.f13044b;
                    switch (i) {
                        case 0:
/* 20 */                    return new C1871kz(c1945mz, saveConsentsData, c10Var, 0);
                        default:
/* 13 */                    return new C1871kz(c1945mz, saveConsentsData, c10Var, 1);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             y80 y80Var = (y80) obj;
/* 5 */             c10 c10Var = (c10) obj2;
                    switch (this.f13043a) {
                        case 0:
                            break;
                    }
/* 18 */            return ((C1871kz) create(y80Var, c10Var)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             int i = this.f13043a;
/* 5 */             SaveConsentsData saveConsentsData = this.f13045c;
/* 7 */             C1945mz c1945mz = this.f13044b;
                    switch (i) {
                        case 0:
/* 99 */                    z10 z10Var = z10.f19902a;
/* 101 */                   pg3.m7417A(obj);
/* 104 */                   g80 g80Var = c1945mz.f14072d;
/* 109 */                   ConsentsBuffer consentsBufferM7631c = ((pz2) g80Var).m7631c();
/* 119 */                   ConsentsBufferEntry consentsBufferEntry = new ConsentsBufferEntry(saveConsentsData.f6333a.f6320e, saveConsentsData);
/* 122 */                   List list = consentsBufferM7631c.f6109a;
/* 128 */                   if (!list.contains(consentsBufferEntry)) {
/* 132 */                       ArrayList arrayList = new ArrayList(list);
/* 135 */                       arrayList.add(consentsBufferEntry);
/* 140 */                       ConsentsBuffer consentsBuffer = new ConsentsBuffer(arrayList);
/* 143 */                       pz2 pz2Var = (pz2) g80Var;
/* 145 */                       pz2Var.getClass();
/* 148 */                       jb1.m5748h();
/* 151 */                       od2 od2Var = pz2Var.f15354e;
/* 153 */                       fh2[] fh2VarArr = fh2.f8216a;
/* 167 */                       od2Var.m7138d("consents_buffer", b21.f2178a.m1199b(ConsentsBuffer.Companion.serializer(), consentsBuffer));
                            }
                            break;
                        default:
/* 12 */                    z10 z10Var2 = z10.f19902a;
/* 14 */                    pg3.m7417A(obj);
/* 17 */                    g80 g80Var2 = c1945mz.f14072d;
/* 26 */                    List list2 = ((pz2) g80Var2).m7631c().f6109a;
/* 30 */                    ArrayList arrayList2 = new ArrayList();
/* 41 */                    for (Object obj2 : list2) {
/* 58 */                        if (((ConsentsBufferEntry) obj2).f6110a != saveConsentsData.f6333a.f6320e) {
/* 60 */                            arrayList2.add(obj2);
                                }
                            }
/* 66 */                    ConsentsBuffer consentsBuffer2 = new ConsentsBuffer(arrayList2);
/* 69 */                    pz2 pz2Var2 = (pz2) g80Var2;
/* 71 */                    pz2Var2.getClass();
/* 74 */                    jb1.m5748h();
/* 77 */                    od2 od2Var2 = pz2Var2.f15354e;
/* 79 */                    fh2[] fh2VarArr2 = fh2.f8216a;
/* 93 */                    od2Var2.m7138d("consents_buffer", b21.f2178a.m1199b(ConsentsBuffer.Companion.serializer(), consentsBuffer2));
                            break;
                    }
/* 96 */            return Unit.f12910a;
                }
            }
