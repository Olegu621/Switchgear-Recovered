            package p000;

            import android.content.Context;
            import java.io.File;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rd0 {

                /* JADX INFO: renamed from: c */
                public static final String[] f15986c = {"/system/priv-app/com.bluestacks.settings"};

                /* JADX INFO: renamed from: d */
                public static final String[] f15987d = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};

                /* JADX INFO: renamed from: e */
                public static final String[] f15988e = {"goldfish"};

                /* JADX INFO: renamed from: f */
                public static final String[] f15989f = {"/dev/socket/qemud", "/dev/qemu_pipe"};

                /* JADX INFO: renamed from: g */
                public static final String[] f15990g = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};

                /* JADX INFO: renamed from: h */
                public static final String[] f15991h = {"fstab.andy", "ueventd.andy.rc"};

                /* JADX INFO: renamed from: i */
                public static final String[] f15992i = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc", "/system/bin/nox-prop", "/system/bin/noxd", "/system/bin/nox-vbox-sf"};

                /* JADX INFO: renamed from: j */
                public static final ru1[] f15993j = {new ru1(1, "init.svc.qemud", null), new ru1(1, "init.svc.qemu-props", null), new ru1(1, "qemu.hw.mainkeys", null), new ru1(1, "qemu.sf.fake_camera", null), new ru1(1, "qemu.sf.lcd_density", null), new ru1(1, "ro.bootloader", "unknown"), new ru1(1, "ro.bootmode", "unknown"), new ru1(1, "ro.hardware", "goldfish"), new ru1(1, "ro.kernel.android.qemud", null), new ru1(1, "ro.kernel.qemu.gles", null), new ru1(1, "ro.kernel.qemu", "1"), new ru1(1, "ro.product.device", "generic"), new ru1(1, "ro.product.model", "sdk"), new ru1(1, "ro.product.name", "sdk")};

                /* JADX INFO: renamed from: k */
                public static rd0 f15994k;

                /* JADX INFO: renamed from: a */
                public final Context f15995a;

                /* JADX INFO: renamed from: b */
                public final ArrayList f15996b;

                public rd0(Context context) {
/* 6 */             ArrayList arrayList = new ArrayList();
/* 9 */             this.f15996b = arrayList;
/* 11 */            this.f15995a = context;
/* 15 */            arrayList.add("com.google.android.launcher.layouts.genymotion");
/* 20 */            arrayList.add("com.bluestacks");
/* 25 */            arrayList.add("com.bignox.app");
                }

                /* JADX INFO: renamed from: a */
                public static boolean m8134a(String[] strArr) {
/* 4 */             for (String str : strArr) {
/* 17 */                if (new File(str).exists()) {
/* 19 */                    return true;
                        }
                    }
/* 2 */             return false;
                }
            }
