            package p000;

            import android.os.Build;
            import android.util.Pair;
            import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
            import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
            import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
            import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
            import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
            import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
            import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
            import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
            import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
            import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
            import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
            import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
            import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
            import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
            import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
            import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
            import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
            import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
            import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
            import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
            import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
            import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
            import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
            import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
            import com.supercell.p007id.scid_plugin.MobileScanner;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.List;
            import java.util.Locale;
            
            /* JADX INFO: renamed from: kr */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     public final /* synthetic */ class C1863kr implements c00 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12989a;

                public /* synthetic */ C1863kr(int i) {
/* 1 */             this.f12989a = i;
                }

                /* JADX WARN: Code duplicated, block: B:149:0x02b4  */
                /* JADX WARN: Code duplicated, block: B:153:0x02c2  */
                /* JADX WARN: Code duplicated, block: B:155:0x02d0  */
                /* JADX WARN: Code duplicated, block: B:158:0x02db  */
                /* JADX WARN: Code duplicated, block: B:167:0x02fe  */
                /* JADX WARN: Code duplicated, block: B:89:0x0189  */
                @Override // p000.c00
                public final void accept(Object obj) {
                    boolean z;
                    boolean z2;
                    String str;
                    boolean zContains;
/* 8 */             boolean z3 = false;
                    switch (this.f12989a) {
                        case 0:
/* 1207 */                  if (obj != null) {
/* 1218 */                      throw new ClassCastException();
                            }
/* 1209 */                  pg3.m7423a();
/* 1212 */                  throw null;
                        case 1:
/* 1195 */                  if (obj != null) {
/* 1206 */                      throw new ClassCastException();
                            }
/* 1197 */                  pg3.m7423a();
/* 1200 */                  throw null;
                        case 2:
/* 1191 */                  pg3.m7423a();
/* 1194 */                  return;
                        case 3:
/* 848 */                   i02 i02Var = (i02) obj;
/* 854 */                   ArrayList arrayList = new ArrayList();
/* 857 */                   String str2 = Build.BRAND;
/* 863 */                   if (("HUAWEI".equalsIgnoreCase(str2) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) || ("HONOR".equalsIgnoreCase(str2) && "STK-LX1".equalsIgnoreCase(Build.MODEL))) {
/* 894 */                       z = true;
                            } else {
/* 896 */                       String str3 = Build.FINGERPRINT;
/* 904 */                       if (!str3.startsWith("generic") && !str3.startsWith("unknown")) {
/* 914 */                           String str4 = Build.MODEL;
/* 922 */                           if (!str4.contains("google_sdk") && !str4.contains("Emulator") && !str4.contains("Cuttlefish") && !str4.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!str2.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !Build.PRODUCT.equals("google_sdk"))) {
/* 984 */                               Build.HARDWARE.contains("ranchu");
                                    }
                                }
/* 987 */                       z = false;
                            }
/* 994 */                   if (i02Var.m4414a(ImageCaptureRotationOptionQuirk.class, z)) {
/* 1001 */                      arrayList.add(new ImageCaptureRotationOptionQuirk());
                            }
/* 1010 */                  if (i02Var.m4414a(SurfaceOrderQuirk.class, true)) {
/* 1017 */                      arrayList.add(new SurfaceOrderQuirk());
                            }
/* 1020 */                  HashSet hashSet = CaptureFailedRetryQuirk.f809a;
/* 1022 */                  Locale locale = Locale.US;
/* 1024 */                  String upperCase = str2.toUpperCase(locale);
/* 1028 */                  String str5 = Build.MODEL;
/* 1050 */                  if (i02Var.m4414a(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.f809a.contains(Pair.create(upperCase, str5.toUpperCase(locale))))) {
/* 1057 */                      arrayList.add(new CaptureFailedRetryQuirk());
                            }
/* 1076 */                  if (i02Var.m4414a(LowMemoryQuirk.class, LowMemoryQuirk.f812a.contains(str5.toUpperCase(locale)))) {
/* 1083 */                      arrayList.add(new LowMemoryQuirk());
                            }
/* 1086 */                  HashSet hashSet2 = LargeJpegImageQuirk.f811a;
/* 1126 */                  if (i02Var.m4414a(LargeJpegImageQuirk.class, "Samsung".equalsIgnoreCase(str2) || ("Vivo".equalsIgnoreCase(str2) && LargeJpegImageQuirk.f811a.contains(str5.toUpperCase(locale))))) {
/* 1133 */                      arrayList.add(new LargeJpegImageQuirk());
                            }
/* 1136 */                  HashSet hashSet3 = IncorrectJpegMetadataQuirk.f810a;
/* 1142 */                  if ("Samsung".equalsIgnoreCase(str2) && IncorrectJpegMetadataQuirk.f810a.contains(Build.DEVICE.toUpperCase(locale))) {
/* 1158 */                      z3 = true;
                            }
/* 1165 */                  if (i02Var.m4414a(IncorrectJpegMetadataQuirk.class, z3)) {
/* 1172 */                      arrayList.add(new IncorrectJpegMetadataQuirk());
                            }
/* 1178 */                  e80.f7571a = new er0(arrayList);
/* 1182 */                  er0.m3576B(e80.f7571a);
/* 1185 */                  hu0.m4312F0("DeviceQuirks");
/* 1188 */                  return;
                        case 4:
/* 22 */                    i02 i02Var2 = (i02) obj;
/* 28 */                    ArrayList arrayList2 = new ArrayList();
/* 31 */                    List list = ImageCapturePixelHDRPlusQuirk.f793a;
/* 33 */                    String str6 = Build.MODEL;
/* 66 */                    if (i02Var2.m4414a(ImageCapturePixelHDRPlusQuirk.class, list.contains(str6) && "Google".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26)) {
/* 73 */                        arrayList2.add(new ImageCapturePixelHDRPlusQuirk());
                            }
/* 86 */                    if (i02Var2.m4414a(ExtraCroppingQuirk.class, ExtraCroppingQuirk.m442c())) {
/* 93 */                        arrayList2.add(new ExtraCroppingQuirk());
                            }
/* 96 */                    List list2 = Nexus4AndroidLTargetAspectRatioQuirk.f801a;
/* 98 */                    String str7 = Build.BRAND;
/* 102 */                   "GOOGLE".equalsIgnoreCase(str7);
/* 111 */                   if (i02Var2.m4414a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
/* 118 */                       arrayList2.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                            }
/* 214 */                   if (i02Var2.m4414a(ExcludedSupportedSizesQuirk.class, ("OnePlus".equalsIgnoreCase(str7) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) || ("OnePlus".equalsIgnoreCase(str7) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) || (("HUAWEI".equalsIgnoreCase(str7) && "HWANE".equalsIgnoreCase(Build.DEVICE)) || ExcludedSupportedSizesQuirk.m440c() || ExcludedSupportedSizesQuirk.m439b() || ("REDMI".equalsIgnoreCase(str7) && "joyeuse".equalsIgnoreCase(Build.DEVICE))))) {
/* 221 */                       arrayList2.add(new ExcludedSupportedSizesQuirk());
                            }
/* 224 */                   List list3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.f781a;
/* 226 */                   Locale locale2 = Locale.US;
/* 242 */                   if (i02Var2.m4414a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, list3.contains(str6.toUpperCase(locale2)))) {
/* 249 */                       arrayList2.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
                            }
/* 252 */                   List list4 = PreviewPixelHDRnetQuirk.f802a;
/* 254 */                   String str8 = Build.MANUFACTURER;
/* 289 */                   if (i02Var2.m4414a(PreviewPixelHDRnetQuirk.class, "Google".equals(str8) && PreviewPixelHDRnetQuirk.f802a.contains(Build.DEVICE.toLowerCase(Locale.getDefault())))) {
/* 296 */                       arrayList2.add(new PreviewPixelHDRnetQuirk());
                            }
/* 332 */                   if (i02Var2.m4414a(StillCaptureFlashStopRepeatingQuirk.class, "SAMSUNG".equals(str8.toUpperCase(locale2)) && str6.toUpperCase(locale2).startsWith("SM-A716"))) {
/* 339 */                       arrayList2.add(new StillCaptureFlashStopRepeatingQuirk());
                            }
/* 342 */                   dj2 dj2Var = ExtraSupportedSurfaceCombinationsQuirk.f783a;
/* 344 */                   String str9 = Build.DEVICE;
/* 352 */                   if ("heroqltevzw".equalsIgnoreCase(str9) || "heroqltetmo".equalsIgnoreCase(str9)) {
/* 394 */                       z2 = true;
                            } else {
/* 369 */                       if ("google".equalsIgnoreCase(str7)) {
/* 379 */                           zContains = ExtraSupportedSurfaceCombinationsQuirk.f785c.contains(str6.toUpperCase(locale2));
                                } else {
/* 371 */                           zContains = false;
                                }
/* 383 */                       if (zContains || ExtraSupportedSurfaceCombinationsQuirk.m443b()) {
/* 394 */                           z2 = true;
                                } else {
/* 392 */                           z2 = false;
                                }
                            }
/* 401 */                   if (i02Var2.m4414a(ExtraSupportedSurfaceCombinationsQuirk.class, z2)) {
/* 408 */                       arrayList2.add(new ExtraSupportedSurfaceCombinationsQuirk());
                            }
/* 436 */                   if (i02Var2.m4414a(FlashAvailabilityBufferUnderflowQuirk.class, FlashAvailabilityBufferUnderflowQuirk.f787a.contains(new Pair(str8.toLowerCase(locale2), str6.toLowerCase(locale2))))) {
/* 443 */                       arrayList2.add(new FlashAvailabilityBufferUnderflowQuirk());
                            }
/* 471 */                   if (i02Var2.m4414a(RepeatingStreamConstraintForVideoRecordingQuirk.class, "Huawei".equalsIgnoreCase(str7) && "mha-l29".equalsIgnoreCase(str6))) {
/* 478 */                       arrayList2.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                            }
/* 487 */                   if (i02Var2.m4414a(TextureViewIsClosedQuirk.class, false)) {
/* 494 */                       arrayList2.add(new TextureViewIsClosedQuirk());
                            }
/* 503 */                   if (i02Var2.m4414a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
/* 510 */                       arrayList2.add(new CaptureSessionOnClosedNotCalledQuirk());
                            }
/* 529 */                   if (i02Var2.m4414a(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.f805a.contains(str6.toLowerCase(locale2)))) {
/* 536 */                       arrayList2.add(new TorchIsClosedAfterImageCapturingQuirk());
                            }
/* 539 */                   List list5 = ZslDisablerQuirk.f806a;
/* 583 */                   if (i02Var2.m4414a(ZslDisablerQuirk.class, ("samsung".equalsIgnoreCase(str7) && ZslDisablerQuirk.m444b(ZslDisablerQuirk.f806a)) || ("xiaomi".equalsIgnoreCase(str7) && ZslDisablerQuirk.m444b(ZslDisablerQuirk.f807b)))) {
/* 590 */                       arrayList2.add(new ZslDisablerQuirk());
                            }
/* 618 */                   if (i02Var2.m4414a(ExtraSupportedOutputSizeQuirk.class, "motorola".equalsIgnoreCase(str7) && "moto e5 play".equalsIgnoreCase(str6))) {
/* 625 */                       arrayList2.add(new ExtraSupportedOutputSizeQuirk());
                            }
/* 628 */                   List list6 = InvalidVideoProfilesQuirk.f796a;
/* 636 */                   if ("samsung".equalsIgnoreCase(str7) && Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a")) {
/* 767 */                       z3 = true;
                            } else {
/* 654 */                       List list7 = InvalidVideoProfilesQuirk.f796a;
/* 656 */                       Locale locale3 = Locale.ROOT;
/* 666 */                       if (list7.contains(str6.toLowerCase(locale3))) {
/* 668 */                           String str10 = Build.ID;
/* 678 */                           if (str10.toLowerCase(locale3).startsWith("tp1a") || str10.toLowerCase(locale3).startsWith("td1a")) {
/* 767 */                               z3 = true;
                                    } else if (!"redmi".equalsIgnoreCase(str7) || "xiaomi".equalsIgnoreCase(str7)) {
/* 707 */                               str = Build.ID;
/* 719 */                               if (!str.toLowerCase(locale3).startsWith("tkq1") || str.toLowerCase(locale3).startsWith("tp1a")) {
/* 767 */                                   z3 = true;
                                        } else if ((InvalidVideoProfilesQuirk.f797b.contains(str6.toLowerCase(locale3)) && Build.VERSION.SDK_INT == 33) || (InvalidVideoProfilesQuirk.f798c.contains(str6.toLowerCase(locale3)) && Build.VERSION.SDK_INT == 33)) {
/* 767 */                                   z3 = true;
                                        }
                                    } else if (InvalidVideoProfilesQuirk.f797b.contains(str6.toLowerCase(locale3))) {
/* 767 */                               z3 = true;
                                    } else {
/* 767 */                               z3 = true;
                                    }
                                } else {
/* 699 */                           if ("redmi".equalsIgnoreCase(str7)) {
/* 707 */                               str = Build.ID;
/* 719 */                               if (str.toLowerCase(locale3).startsWith("tkq1")) {
                                        }
                                    } else {
/* 707 */                               str = Build.ID;
/* 719 */                               if (str.toLowerCase(locale3).startsWith("tkq1")) {
                                        }
                                    }
/* 767 */                           z3 = true;
                                }
                            }
/* 774 */                   if (i02Var2.m4414a(InvalidVideoProfilesQuirk.class, z3)) {
/* 781 */                       arrayList2.add(new InvalidVideoProfilesQuirk());
                            }
/* 798 */                   if (i02Var2.m4414a(Preview3AThreadCrashQuirk.class, "samsungexynos7870".equalsIgnoreCase(Build.HARDWARE))) {
/* 805 */                       arrayList2.add(new Preview3AThreadCrashQuirk());
                            }
/* 824 */                   if (i02Var2.m4414a(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.f803a.containsKey(str6.toUpperCase(locale2)))) {
/* 831 */                       arrayList2.add(new SmallDisplaySizeQuirk());
                            }
/* 837 */                   f80.f8038a = new er0(arrayList2);
/* 841 */                   er0.m3576B(f80.f8038a);
/* 844 */                   hu0.m4312F0("DeviceQuirks");
/* 847 */                   return;
                        case 5:
/* 21 */                    return;
                        default:
/* 1 */                     MobileScanner.start$lambda$5$lambda$2$lambda$1((qj2) obj);
/* 18 */                    return;
                    }
                }

/* 6 */         public /* synthetic */ C1863kr(C0210cb c0210cb, int i) {
/* 7 */             this.f12989a = i;
                }
            }
