            package p000;

            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            /* JADX INFO: renamed from: cv */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C0821cv {
                public C0821cv(DefaultConstructorMarker defaultConstructorMarker) {
                }

                /* JADX WARN: Failed to clean up code after switch over string restore
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:331:? A[RegionRef:SW:6] (LINE:14)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
                	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
                 */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX INFO: renamed from: a */
                public static String m2891a(String str) {
                    switch (str) {
                        case "kotlin.jvm.internal.DoubleCompanionObject":
/* 842 */                   return "kotlin.Double.Companion";
                        case "java.lang.Integer":
/* 829 */                   return "kotlin.Int";
                        case "java.lang.Cloneable":
/* 817 */                   return "kotlin.Cloneable";
                        case "java.lang.annotation.Annotation":
/* 805 */                   return "kotlin.Annotation";
                        case "java.lang.Comparable":
/* 793 */                   return "kotlin.Comparable";
                        case "java.util.Map":
/* 781 */                   return "kotlin.collections.Map";
                        case "java.util.Set":
/* 769 */                   return "kotlin.collections.Set";
                        case "double":
/* 757 */                   return "kotlin.Double";
                        case "kotlin.jvm.internal.ByteCompanionObject":
/* 745 */                   return "kotlin.Byte.Companion";
                        case "java.lang.CharSequence":
/* 733 */                   return "kotlin.CharSequence";
                        case "java.util.Collection":
/* 720 */                   return "kotlin.collections.Collection";
                        case "java.lang.Float":
/* 707 */                   return "kotlin.Float";
                        case "java.lang.Short":
/* 694 */                   return "kotlin.Short";
                        case "kotlin.jvm.internal.CharCompanionObject":
/* 681 */                   return "kotlin.Char.Companion";
                        case "kotlin.jvm.internal.LongCompanionObject":
/* 668 */                   return "kotlin.Long.Companion";
                        case "java.util.Map$Entry":
/* 655 */                   return "kotlin.collections.Map.Entry";
                        case "int":
/* 829 */                   return "kotlin.Int";
                        case "byte":
/* 632 */                   return "kotlin.Byte";
                        case "char":
/* 619 */                   return "kotlin.Char";
                        case "long":
/* 606 */                   return "kotlin.Long";
                        case "boolean":
/* 593 */                   return "kotlin.Boolean";
                        case "java.util.List":
/* 580 */                   return "kotlin.collections.List";
                        case "kotlin.jvm.internal.ShortCompanionObject":
/* 567 */                   return "kotlin.Short.Companion";
                        case "float":
/* 707 */                   return "kotlin.Float";
                        case "short":
/* 694 */                   return "kotlin.Short";
                        case "java.lang.Character":
/* 619 */                   return "kotlin.Char";
                        case "kotlin.jvm.internal.EnumCompanionObject":
/* 524 */                   return "kotlin.Enum.Companion";
                        case "java.lang.Boolean":
/* 593 */                   return "kotlin.Boolean";
                        case "java.lang.Byte":
/* 632 */                   return "kotlin.Byte";
                        case "java.lang.Enum":
/* 491 */                   return "kotlin.Enum";
                        case "java.lang.Long":
/* 606 */                   return "kotlin.Long";
                        case "kotlin.jvm.internal.FloatCompanionObject":
/* 468 */                   return "kotlin.Float.Companion";
                        case "java.util.Iterator":
/* 455 */                   return "kotlin.collections.Iterator";
                        case "java.util.ListIterator":
/* 442 */                   return "kotlin.collections.ListIterator";
                        case "kotlin.jvm.internal.StringCompanionObject":
/* 429 */                   return "kotlin.String.Companion";
                        case "java.lang.Double":
/* 757 */                   return "kotlin.Double";
                        case "java.lang.Number":
/* 406 */                   return "kotlin.Number";
                        case "java.lang.Object":
/* 393 */                   return "kotlin.Any";
                        case "java.lang.String":
/* 380 */                   return "kotlin.String";
                        case "java.lang.Iterable":
/* 367 */                   return "kotlin.collections.Iterable";
                        case "kotlin.jvm.internal.BooleanCompanionObject":
/* 354 */                   return "kotlin.Boolean.Companion";
                        case "java.lang.Throwable":
/* 341 */                   return "kotlin.Throwable";
                        case "kotlin.jvm.internal.IntCompanionObject":
/* 328 */                   return "kotlin.Int.Companion";
                        default:
                            switch (str) {
                                case -1811142716:
/* 311 */                           if (str.equals("kotlin.jvm.functions.Function10")) {
/* 315 */                               return "kotlin.Function10";
                                    }
/* 840 */                           return null;
                                case -1811142715:
/* 298 */                           if (str.equals("kotlin.jvm.functions.Function11")) {
/* 302 */                               return "kotlin.Function11";
                                    }
/* 840 */                           return null;
                                case -1811142714:
/* 285 */                           if (str.equals("kotlin.jvm.functions.Function12")) {
/* 289 */                               return "kotlin.Function12";
                                    }
/* 840 */                           return null;
                                case -1811142713:
/* 272 */                           if (str.equals("kotlin.jvm.functions.Function13")) {
/* 276 */                               return "kotlin.Function13";
                                    }
/* 840 */                           return null;
                                case -1811142712:
/* 259 */                           if (str.equals("kotlin.jvm.functions.Function14")) {
/* 263 */                               return "kotlin.Function14";
                                    }
/* 840 */                           return null;
                                case -1811142711:
/* 246 */                           if (str.equals("kotlin.jvm.functions.Function15")) {
/* 250 */                               return "kotlin.Function15";
                                    }
/* 840 */                           return null;
                                case -1811142710:
/* 233 */                           if (str.equals("kotlin.jvm.functions.Function16")) {
/* 237 */                               return "kotlin.Function16";
                                    }
/* 840 */                           return null;
                                case -1811142709:
/* 220 */                           if (str.equals("kotlin.jvm.functions.Function17")) {
/* 224 */                               return "kotlin.Function17";
                                    }
/* 840 */                           return null;
                                case -1811142708:
/* 207 */                           if (str.equals("kotlin.jvm.functions.Function18")) {
/* 211 */                               return "kotlin.Function18";
                                    }
/* 840 */                           return null;
                                case -1811142707:
/* 194 */                           if (str.equals("kotlin.jvm.functions.Function19")) {
/* 198 */                               return "kotlin.Function19";
                                    }
/* 840 */                           return null;
                                default:
                                    switch (str) {
                                        case -1811142685:
/* 181 */                                   if (str.equals("kotlin.jvm.functions.Function20")) {
/* 185 */                                       return "kotlin.Function20";
                                            }
/* 840 */                                   return null;
                                        case -1811142684:
/* 168 */                                   if (str.equals("kotlin.jvm.functions.Function21")) {
/* 172 */                                       return "kotlin.Function21";
                                            }
/* 840 */                                   return null;
                                        case -1811142683:
/* 155 */                                   if (str.equals("kotlin.jvm.functions.Function22")) {
/* 159 */                                       return "kotlin.Function22";
                                            }
/* 840 */                                   return null;
                                        default:
                                            switch (str) {
                                                case 80123371:
/* 142 */                                           if (str.equals("kotlin.jvm.functions.Function0")) {
/* 146 */                                               return "kotlin.Function0";
                                                    }
/* 840 */                                           return null;
                                                case 80123372:
/* 129 */                                           if (str.equals("kotlin.jvm.functions.Function1")) {
/* 133 */                                               return "kotlin.Function1";
                                                    }
/* 840 */                                           return null;
                                                case 80123373:
/* 116 */                                           if (str.equals("kotlin.jvm.functions.Function2")) {
/* 120 */                                               return "kotlin.Function2";
                                                    }
/* 840 */                                           return null;
                                                case 80123374:
/* 103 */                                           if (str.equals("kotlin.jvm.functions.Function3")) {
/* 107 */                                               return "kotlin.Function3";
                                                    }
/* 840 */                                           return null;
                                                case 80123375:
/* 90 */                                            if (str.equals("kotlin.jvm.functions.Function4")) {
/* 94 */                                                return "kotlin.Function4";
                                                    }
/* 840 */                                           return null;
                                                case 80123376:
/* 77 */                                            if (str.equals("kotlin.jvm.functions.Function5")) {
/* 81 */                                                return "kotlin.Function5";
                                                    }
/* 840 */                                           return null;
                                                case 80123377:
/* 64 */                                            if (str.equals("kotlin.jvm.functions.Function6")) {
/* 68 */                                                return "kotlin.Function6";
                                                    }
/* 840 */                                           return null;
                                                case 80123378:
/* 51 */                                            if (str.equals("kotlin.jvm.functions.Function7")) {
/* 55 */                                                return "kotlin.Function7";
                                                    }
/* 840 */                                           return null;
                                                case 80123379:
/* 38 */                                            if (str.equals("kotlin.jvm.functions.Function8")) {
/* 42 */                                                return "kotlin.Function8";
                                                    }
/* 840 */                                           return null;
                                                case 80123380:
/* 25 */                                            if (str.equals("kotlin.jvm.functions.Function9")) {
/* 29 */                                                return "kotlin.Function9";
                                                    }
/* 840 */                                           return null;
                                                default:
/* 840 */                                           return null;
                                            }
                                    }
                            }
                    }
                }

                /* JADX WARN: Failed to clean up code after switch over string restore
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:313:? A[RegionRef:SW:6] (LINE:14)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
                	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
                 */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX INFO: renamed from: b */
                public static String m2892b(String str) {
                    switch (str) {
                        case "kotlin.jvm.internal.DoubleCompanionObject":
/* 815 */                   return "Companion";
                        case "java.lang.Integer":
/* 802 */                   return "Int";
                        case "java.lang.Cloneable":
/* 790 */                   return "Cloneable";
                        case "java.lang.annotation.Annotation":
/* 778 */                   return "Annotation";
                        case "java.lang.Comparable":
/* 766 */                   return "Comparable";
                        case "java.util.Map":
/* 754 */                   return "Map";
                        case "java.util.Set":
/* 742 */                   return "Set";
                        case "double":
/* 730 */                   return "Double";
                        case "kotlin.jvm.internal.ByteCompanionObject":
/* 815 */                   return "Companion";
                        case "java.lang.CharSequence":
/* 709 */                   return "CharSequence";
                        case "java.util.Collection":
/* 696 */                   return "Collection";
                        case "java.lang.Float":
/* 683 */                   return "Float";
                        case "java.lang.Short":
/* 670 */                   return "Short";
                        case "kotlin.jvm.internal.CharCompanionObject":
/* 815 */                   return "Companion";
                        case "kotlin.jvm.internal.LongCompanionObject":
/* 815 */                   return "Companion";
                        case "java.util.Map$Entry":
/* 637 */                   return "Entry";
                        case "int":
/* 802 */                   return "Int";
                        case "byte":
/* 614 */                   return "Byte";
                        case "char":
/* 601 */                   return "Char";
                        case "long":
/* 588 */                   return "Long";
                        case "boolean":
/* 575 */                   return "Boolean";
                        case "java.util.List":
/* 562 */                   return "List";
                        case "kotlin.jvm.internal.ShortCompanionObject":
/* 815 */                   return "Companion";
                        case "float":
/* 683 */                   return "Float";
                        case "short":
/* 670 */                   return "Short";
                        case "java.lang.Character":
/* 601 */                   return "Char";
                        case "kotlin.jvm.internal.EnumCompanionObject":
/* 815 */                   return "Companion";
                        case "java.lang.Boolean":
/* 575 */                   return "Boolean";
                        case "java.lang.Byte":
/* 614 */                   return "Byte";
                        case "java.lang.Enum":
/* 479 */                   return "Enum";
                        case "java.lang.Long":
/* 588 */                   return "Long";
                        case "kotlin.jvm.internal.FloatCompanionObject":
/* 815 */                   return "Companion";
                        case "java.util.Iterator":
/* 446 */                   return "Iterator";
                        case "java.util.ListIterator":
/* 433 */                   return "ListIterator";
                        case "kotlin.jvm.internal.StringCompanionObject":
/* 815 */                   return "Companion";
                        case "java.lang.Double":
/* 730 */                   return "Double";
                        case "java.lang.Number":
/* 400 */                   return "Number";
                        case "java.lang.Object":
/* 387 */                   return "Any";
                        case "java.lang.String":
/* 374 */                   return "String";
                        case "java.lang.Iterable":
/* 361 */                   return "Iterable";
                        case "kotlin.jvm.internal.BooleanCompanionObject":
/* 815 */                   return "Companion";
                        case "java.lang.Throwable":
/* 338 */                   return "Throwable";
                        case "kotlin.jvm.internal.IntCompanionObject":
/* 815 */                   return "Companion";
                        default:
                            switch (str) {
                                case -1811142716:
/* 311 */                           if (str.equals("kotlin.jvm.functions.Function10")) {
/* 315 */                               return "Function10";
                                    }
/* 813 */                           return null;
                                case -1811142715:
/* 298 */                           if (str.equals("kotlin.jvm.functions.Function11")) {
/* 302 */                               return "Function11";
                                    }
/* 813 */                           return null;
                                case -1811142714:
/* 285 */                           if (str.equals("kotlin.jvm.functions.Function12")) {
/* 289 */                               return "Function12";
                                    }
/* 813 */                           return null;
                                case -1811142713:
/* 272 */                           if (str.equals("kotlin.jvm.functions.Function13")) {
/* 276 */                               return "Function13";
                                    }
/* 813 */                           return null;
                                case -1811142712:
/* 259 */                           if (str.equals("kotlin.jvm.functions.Function14")) {
/* 263 */                               return "Function14";
                                    }
/* 813 */                           return null;
                                case -1811142711:
/* 246 */                           if (str.equals("kotlin.jvm.functions.Function15")) {
/* 250 */                               return "Function15";
                                    }
/* 813 */                           return null;
                                case -1811142710:
/* 233 */                           if (str.equals("kotlin.jvm.functions.Function16")) {
/* 237 */                               return "Function16";
                                    }
/* 813 */                           return null;
                                case -1811142709:
/* 220 */                           if (str.equals("kotlin.jvm.functions.Function17")) {
/* 224 */                               return "Function17";
                                    }
/* 813 */                           return null;
                                case -1811142708:
/* 207 */                           if (str.equals("kotlin.jvm.functions.Function18")) {
/* 211 */                               return "Function18";
                                    }
/* 813 */                           return null;
                                case -1811142707:
/* 194 */                           if (str.equals("kotlin.jvm.functions.Function19")) {
/* 198 */                               return "Function19";
                                    }
/* 813 */                           return null;
                                default:
                                    switch (str) {
                                        case -1811142685:
/* 181 */                                   if (str.equals("kotlin.jvm.functions.Function20")) {
/* 185 */                                       return "Function20";
                                            }
/* 813 */                                   return null;
                                        case -1811142684:
/* 168 */                                   if (str.equals("kotlin.jvm.functions.Function21")) {
/* 172 */                                       return "Function21";
                                            }
/* 813 */                                   return null;
                                        case -1811142683:
/* 155 */                                   if (str.equals("kotlin.jvm.functions.Function22")) {
/* 159 */                                       return "Function22";
                                            }
/* 813 */                                   return null;
                                        default:
                                            switch (str) {
                                                case 80123371:
/* 142 */                                           if (str.equals("kotlin.jvm.functions.Function0")) {
/* 146 */                                               return "Function0";
                                                    }
/* 813 */                                           return null;
                                                case 80123372:
/* 129 */                                           if (str.equals("kotlin.jvm.functions.Function1")) {
/* 133 */                                               return "Function1";
                                                    }
/* 813 */                                           return null;
                                                case 80123373:
/* 116 */                                           if (str.equals("kotlin.jvm.functions.Function2")) {
/* 120 */                                               return "Function2";
                                                    }
/* 813 */                                           return null;
                                                case 80123374:
/* 103 */                                           if (str.equals("kotlin.jvm.functions.Function3")) {
/* 107 */                                               return "Function3";
                                                    }
/* 813 */                                           return null;
                                                case 80123375:
/* 90 */                                            if (str.equals("kotlin.jvm.functions.Function4")) {
/* 94 */                                                return "Function4";
                                                    }
/* 813 */                                           return null;
                                                case 80123376:
/* 77 */                                            if (str.equals("kotlin.jvm.functions.Function5")) {
/* 81 */                                                return "Function5";
                                                    }
/* 813 */                                           return null;
                                                case 80123377:
/* 64 */                                            if (str.equals("kotlin.jvm.functions.Function6")) {
/* 68 */                                                return "Function6";
                                                    }
/* 813 */                                           return null;
                                                case 80123378:
/* 51 */                                            if (str.equals("kotlin.jvm.functions.Function7")) {
/* 55 */                                                return "Function7";
                                                    }
/* 813 */                                           return null;
                                                case 80123379:
/* 38 */                                            if (str.equals("kotlin.jvm.functions.Function8")) {
/* 42 */                                                return "Function8";
                                                    }
/* 813 */                                           return null;
                                                case 80123380:
/* 25 */                                            if (str.equals("kotlin.jvm.functions.Function9")) {
/* 29 */                                                return "Function9";
                                                    }
/* 813 */                                           return null;
                                                default:
/* 813 */                                           return null;
                                            }
                                    }
                            }
                    }
                }
            }
