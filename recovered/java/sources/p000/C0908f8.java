            package p000;

            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import android.media.MediaCodec;
            import android.media.MediaCodecInfo;
            import android.media.MediaFormat;
            import com.supercell.titan.usercentrics.UsercentricsSDK;
            import com.usercentrics.sdk.p008ui.R$dimen;
            import com.usercentrics.sdk.p008ui.R$id;
            import com.usercentrics.sdk.p008ui.components.UCTextView;
            import com.usercentrics.sdk.p008ui.components.cards.UCCardSections;
            import com.usercentrics.sdk.p008ui.components.links.UCLink;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFData;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialFeature;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFStack;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.C1554m6;
            import io.sentry.EnumC1553m5;
            import io.sentry.android.core.C1181d;
            import io.sentry.android.replay.C1372x;
            import io.sentry.android.replay.ViewTreeObserverOnDrawListenerC1371w;
            import io.sentry.android.replay.screenshot.C1337c;
            import io.sentry.android.replay.util.C1351e;
            import io.sentry.android.replay.video.C1360a;
            import java.io.File;
            import java.math.BigInteger;
            import java.net.HttpURLConnection;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: renamed from: f8 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class C0908f8 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8036a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f8037b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0908f8(a13 a13Var, t03 t03Var) {
/* 8 */             super(0);
/* 3 */             this.f8036a = 20;
/* 5 */             this.f8037b = a13Var;
                }

                /* JADX WARN: Code duplicated, block: B:131:0x026e A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:132:0x0270 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:133:? A[LOOP:4: B:77:0x0258->B:133:?, LOOP_END, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:76:0x0254  */
                /* JADX WARN: Code duplicated, block: B:79:0x025e  */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean z;
                    Iterator it;
                    String strM4327V;
/* 1 */             int i = this.f8036a;
/* 4 */             bw1 bw1VarValueOf = null;
/* 5 */             int i2 = 1;
/* 7 */             Object obj = this.f8037b;
                    switch (i) {
                        case 0:
/* 807 */                   ((HttpURLConnection) obj).disconnect();
/* 810 */                   return Unit.f12910a;
                        case 1:
/* 799 */                   ((C0908f8) obj).invoke();
/* 802 */                   return Unit.f12910a;
                        case 2:
/* 794 */                   return ((sx0) obj).f16842d.f15029b;
                        case 3:
/* 784 */                   ((vf1) obj).m9263c(new C2065pc(i2), null, null, null);
/* 787 */                   return Unit.f12910a;
                        case 4:
/* 772 */                   return hu0.m4320K("kotlin.Unit", ei2.f7701n, new SerialDescriptor[0], new C1983o((ep1) obj, 11));
                        case 5:
/* 736 */                   mt1 mt1Var = (mt1) obj;
/* 753 */                   return new x00(hu0.m4320K("kotlinx.serialization.Polymorphic", lt1.f13492k, new SerialDescriptor[0], new C1983o(mt1Var, 13)), mt1Var.f14021a);
                        case 6:
/* 676 */                   File file = (File) ((cb1) obj).invoke();
/* 678 */                   String name = file.getName();
/* 682 */                   name.getClass();
/* 687 */                   int iM6230F = StringsKt.m6230F(name, '.', 0, 6);
/* 712 */                   if (!(iM6230F == -1 ? HttpUrl.FRAGMENT_ENCODE_SET : name.substring(iM6230F + 1, name.length())).equals("preferences_pb")) {
/* 726 */                       ds0.m3202s(file, "File extension for file: ", " does not match required extension for Preferences file: preferences_pb");
/* 4 */                         return null;
                            }
/* 714 */                   File absoluteFile = file.getAbsoluteFile();
/* 718 */                   absoluteFile.getClass();
/* 729 */                   return absoluteFile;
                        case 7:
/* 665 */                   return ((m62) obj).f13603c.m6997a();
                        case 8:
/* 656 */                   return mn0.m6703s((u33) obj);
                        case 9:
/* 641 */                   aa2 aa2Var = (aa2) obj;
/* 649 */                   return Integer.valueOf(k50.m5989z(aa2Var, aa2Var.f152j));
                        case 10:
/* 429 */                   m03 m03Var = n03.Companion;
/* 433 */                   TCFData tCFData = ((bl2) obj).f2524b;
/* 435 */                   m03Var.getClass();
/* 447 */                   List<TCFStack> listM6186E = CollectionsKt.m6186E(new wa3(17), tCFData.f6164e);
/* 453 */                   ArrayList arrayList = new ArrayList();
/* 464 */                   for (TCFStack tCFStack : listM6186E) {
/* 472 */                       List list = tCFData.f6161b;
/* 476 */                       ArrayList arrayList2 = new ArrayList();
/* 487 */                       for (Object obj2 : list) {
/* 508 */                           if (tCFStack.f6203d.contains(Integer.valueOf(((TCFPurpose) obj2).f6176c))) {
/* 510 */                               arrayList2.add(obj2);
                                    }
                                }
/* 514 */                       List list2 = tCFData.f6162c;
/* 518 */                       ArrayList arrayList3 = new ArrayList();
/* 529 */                       for (Object obj3 : list2) {
/* 550 */                           if (tCFStack.f6204e.contains(Integer.valueOf(((TCFSpecialFeature) obj3).f6188c))) {
/* 552 */                               arrayList3.add(obj3);
                                    }
                                }
/* 560 */                       if (arrayList2.isEmpty()) {
/* 594 */                           if (!arrayList3.isEmpty()) {
/* 597 */                               it = arrayList3.iterator();
                                        while (true) {
/* 605 */                                   if (it.hasNext()) {
/* 621 */                                       if (Intrinsics.m6216a(((TCFSpecialFeature) it.next()).f6190e, Boolean.TRUE)) {
/* 623 */                                           z = true;
                                                }
                                            }
                                        }
                                    }
/* 625 */                           z = false;
                                } else {
/* 563 */                           Iterator it2 = arrayList2.iterator();
                                    while (true) {
/* 571 */                               if (!it2.hasNext()) {
/* 594 */                                   if (!arrayList3.isEmpty()) {
/* 597 */                                       it = arrayList3.iterator();
                                                while (true) {
/* 605 */                                           if (it.hasNext()) {
/* 621 */                                               if (Intrinsics.m6216a(((TCFSpecialFeature) it.next()).f6190e, Boolean.TRUE)) {
                                                        }
                                                    }
                                                }
                                            }
/* 625 */                                   z = false;
                                        } else if (Intrinsics.m6216a(((TCFPurpose) it2.next()).f6178e, Boolean.TRUE)) {
                                        }
/* 623 */                               z = true;
                                    }
                                }
/* 631 */                       arrayList.add(new eg2(z, tCFStack));
                            }
/* 636 */                   return CollectionsKt.m6192K(arrayList);
                        case 11:
/* 424 */                   return Integer.valueOf(((ys2) obj).getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerPopupMargin));
                        case 12:
/* 407 */                   return Integer.valueOf((int) ((UCCardSections) obj).getContext().getResources().getDimension(R$dimen.ucCardVerticalMargin));
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 385 */                   return ((oz2) ((hk2) ((ra2) obj).f15957c).getValue()).mo5633b();
                        case 14:
/* 367 */                   ((hu2) obj).invoke();
/* 370 */                   return Unit.f12910a;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 360 */                   return Integer.valueOf(((qu2) obj).getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerCardsVerticalMargin));
                        case 16:
/* 345 */                   return (UCTextView) ((UCLink) obj).findViewById(R$id.ucLinkText);
                        case 17:
/* 289 */                   gv1 gv1Var = ((nl1) obj).f14360a;
/* 291 */                   od2 od2Var = gv1Var.f8825b;
/* 293 */                   fh2[] fh2VarArr = fh2.f8216a;
/* 295 */                   od2Var.getClass();
/* 302 */                   String string = od2Var.f14716a.getString("ui_variant", null);
/* 306 */                   if (string != null && (strM4327V = hu0.m4327V(string)) != null) {
/* 315 */                       od2Var.m7135a("ui_variant");
/* 318 */                       bw1VarValueOf = bw1.valueOf(strM4327V);
                            }
/* 322 */                   if (bw1VarValueOf != null) {
/* 324 */                       return bw1VarValueOf.name();
                            }
/* 331 */                   gv1Var.f8824a.getClass();
/* 334 */                   return "predefined";
                        case 18:
/* 281 */                   e03.f7467b.m1156a(new o42(obj));
/* 284 */                   return Unit.f12910a;
                        case 19:
/* 268 */                   ((C1908lz) obj).invoke();
/* 271 */                   return Unit.f12910a;
                        case 20:
/* 243 */                   a13 a13Var = (a13) obj;
/* 253 */                   a13Var.f30a.m3699e().mo2906a("Clear User Session finished with success", null);
/* 1 */                     UsercentricsSDK.reset$lambda$21(a13Var.mo22b());
/* 263 */                   return Unit.f12910a;
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 201 */                   g23 g23Var = (g23) obj;
/* 238 */                   return BigInteger.valueOf(g23Var.f8442a).shiftLeft(32).or(BigInteger.valueOf(g23Var.f8443b)).shiftLeft(32).or(BigInteger.valueOf(g23Var.f8444c));
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 195 */                   ((ViewTreeObserverOnDrawListenerC1371w) obj).f10701d.set(true);
/* 198 */                   return Unit.f12910a;
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 176 */                   Matrix matrix = new Matrix();
/* 181 */                   C1372x c1372x = ((C1337c) obj).f10579d;
/* 187 */                   matrix.preScale(c1372x.f10705c, c1372x.f10706d);
/* 190 */                   return matrix;
                        case 24:
/* 170 */                   return new Canvas((Bitmap) ((C1351e) obj).f10658a.getValue());
                        default:
/* 14 */                    C1181d c1181d = (C1181d) obj;
/* 18 */                    C1360a c1360a = (C1360a) c1181d.f9985b;
/* 22 */                    C1554m6 c1554m6 = (C1554m6) c1181d.f9984a;
/* 24 */                    String str = c1360a.f10672f;
/* 26 */                    int iIntValue = c1360a.f10671e;
                            try {
/* 40 */                        MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodec) c1181d.f9986c).getCodecInfo().getCapabilitiesForType(str).getVideoCapabilities();
/* 56 */                        if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(iIntValue))) {
/* 83 */                            c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, "Encoder doesn't support the provided bitRate: " + iIntValue + ", the value will be clamped to the closest one", new Object[0]);
/* 94 */                            Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(iIntValue));
/* 98 */                            objClamp.getClass();
/* 103 */                           iIntValue = ((Number) objClamp).intValue();
                                }
                                break;
                            } catch (Throwable th) {
/* 117 */                       c1554m6.getLogger().mo4671d(EnumC1553m5.DEBUG, "Could not retrieve MediaCodec info", th);
                            }
/* 124 */                   MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, c1360a.f10668b, c1360a.f10669c);
/* 128 */                   mediaFormatCreateVideoFormat.getClass();
/* 136 */                   mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
/* 141 */                   mediaFormatCreateVideoFormat.setInteger("bitrate", iIntValue);
/* 149 */                   mediaFormatCreateVideoFormat.setFloat("frame-rate", c1360a.f10670d);
/* 154 */                   mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
/* 157 */                   return mediaFormatCreateVideoFormat;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 11 */        public /* synthetic */ C0908f8(Object obj, int i) {
                    super(0);
/* 12 */            this.f8036a = i;
                    this.f8037b = obj;
                }
            }
