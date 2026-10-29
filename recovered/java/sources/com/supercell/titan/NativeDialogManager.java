            package com.supercell.titan;

            import android.app.AlertDialog;
            import android.app.Dialog;
            import android.app.DialogFragment;
            import android.content.ActivityNotFoundException;
            import android.content.DialogInterface;
            import android.content.Intent;
            import android.net.wifi.WifiManager;
            import android.os.Bundle;
            import android.os.Parcelable;
            import androidx.core.content.FileProvider;
            import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
            import java.io.File;
            import java.util.ArrayList;
            import java.util.Vector;
            import p000.bq0;
            import p000.jl1;
            import p000.kl1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class NativeDialogManager extends DialogFragment {
                public static final String VISIBLE_NATIVE_DIALOG_TAG = "NativeDialog";

                /* JADX INFO: renamed from: c */
                public static int f5827c = 1000;

                /* JADX INFO: renamed from: d */
                public static NativeDialogManager f5828d = null;
                public static int dismissedButtonID = 0;
                public static int dismissedDialogID = 0;
                public static boolean doDialogDismiss = false;

                /* JADX INFO: renamed from: e */
                public static final Vector f5829e = new Vector();

                /* JADX INFO: renamed from: a */
                public int f5830a = -1;

                /* JADX INFO: renamed from: b */
                public boolean f5831b;

                public static int ShowDialog(String str, String str2, String str3, String str4, String str5) {
/* 3 */             int i = f5827c + 1;
/* 5 */             f5827c = i;
/* 9 */             if (f5828d == null) {
/* 11 */                GameApp gameApp = GameApp.getInstance();
/* 25 */                gameApp.runOnUiThread(new jl1(str, str2, str3, str4, str5, i, gameApp));
/* 28 */                return i;
                    }
/* 36 */            kl1 kl1Var = new kl1();
/* 39 */            kl1Var.f12868a = str;
/* 41 */            kl1Var.f12869b = str2;
/* 43 */            kl1Var.f12870c = str3;
/* 45 */            kl1Var.f12871d = str4;
/* 47 */            kl1Var.f12872e = str5;
/* 49 */            kl1Var.f12873f = i;
/* 53 */            f5829e.add(kl1Var);
/* 56 */            return i;
                }

                public static void ShowPostDialog(String str, String str2) {
/* 1 */             GameApp gameApp = GameApp.getInstance();
                    try {
/* 9 */                 Intent intent = new Intent("android.intent.action.SEND");
/* 14 */                intent.setType("text/plain");
/* 19 */                intent.addFlags(524288);
/* 24 */                intent.putExtra("android.intent.extra.TEXT", str);
/* 31 */                gameApp.startActivity(Intent.createChooser(intent, str2));
                    } catch (ActivityNotFoundException e) {
/* 36 */                GameApp.debuggerException(e);
                    }
                }

                public static void ShowPostURLDialog(String str, String str2, String str3) {
/* 1 */             GameApp gameApp = GameApp.getInstance();
                    try {
/* 9 */                 Intent intent = new Intent("android.intent.action.SEND");
/* 14 */                intent.setType("text/plain");
/* 19 */                intent.addFlags(524288);
/* 24 */                intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str);
/* 29 */                intent.putExtra("android.intent.extra.TEXT", str3);
/* 36 */                gameApp.startActivity(Intent.createChooser(intent, str2));
                    } catch (ActivityNotFoundException e) {
/* 41 */                GameApp.debuggerException(e);
                    }
                }

                public static void ShowShareFilesDialog(String str, String[] strArr) {
/* 1 */             GameApp gameApp = GameApp.getInstance();
/* 8 */             ArrayList<? extends Parcelable> arrayList = new ArrayList<>(strArr.length);
/* 13 */            for (String str2 : strArr) {
/* 47 */                arrayList.add(FileProvider.getUriForFile(gameApp, gameApp.getPackageName() + ".nativesharing.fileprovider", new File(str2)));
                    }
/* 57 */            Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
/* 62 */            intent.setType("*/*");
/* 67 */            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
/* 71 */            intent.addFlags(1);
/* 78 */            gameApp.startActivity(Intent.createChooser(intent, str));
                }

                public static boolean isDialogVisible() {
                    return f5828d != null;
                }

                public static void nativeDialogDismissAll() {
/* 3 */             f5829e.clear();
/* 6 */             NativeDialogManager nativeDialogManager = f5828d;
/* 9 */             f5828d = null;
/* 11 */            if (nativeDialogManager != null) {
/* 14 */                nativeDialogManager.f5831b = true;
                        try {
/* 16 */                    nativeDialogManager.dismiss();
                        } catch (Exception e) {
/* 21 */                    GameApp.debuggerException(e);
                        }
                    }
/* 25 */            doDialogDismiss = false;
/* 31 */            GameApp.getInstance().getView();
                }

                /* JADX INFO: renamed from: a */
                public final void m2735a(int i, int i2) {
/* 3 */             if (this.f5831b) {
/* 5 */                 return;
                    }
/* 7 */             this.f5831b = true;
/* 10 */            f5828d = null;
/* 12 */            GameApp gameApp = GameApp.getInstance();
/* 16 */            Vector vector = f5829e;
/* 22 */            if (vector.isEmpty()) {
/* 62 */                WifiManager wifiManager = (WifiManager) gameApp.getSystemService("wifi");
/* 64 */                if (wifiManager != null) {
                            try {
/* 66 */                        wifiManager.reconnect();
                            } catch (Exception unused) {
                            }
                        }
                    } else {
/* 29 */                kl1 kl1Var = (kl1) vector.remove(0);
/* 31 */                String str = kl1Var.f12868a;
/* 33 */                String str2 = kl1Var.f12869b;
/* 35 */                String str3 = kl1Var.f12870c;
/* 37 */                String str4 = kl1Var.f12871d;
/* 39 */                String str5 = kl1Var.f12872e;
/* 41 */                int i3 = kl1Var.f12873f;
/* 43 */                GameApp gameApp2 = GameApp.getInstance();
/* 52 */                gameApp2.runOnUiThread(new jl1(str, str2, str3, str4, str5, i3, gameApp2));
                    }
/* 69 */            doDialogDismiss = true;
/* 71 */            dismissedDialogID = i;
/* 73 */            dismissedButtonID = i2;
/* 75 */            GameApp.dialogDismissed(i, i2);
                }

                @Override // android.app.DialogFragment
                public Dialog onCreateDialog(Bundle bundle) {
/* 1 */             GameApp gameApp = GameApp.getInstance();
/* 5 */             if (gameApp == null) {
/* 7 */                 return null;
                    }
/* 12 */            bq0 bq0Var = new bq0(this, 1);
/* 21 */            String string = getArguments().getString("title");
/* 31 */            String string2 = getArguments().getString("button");
/* 41 */            String string3 = getArguments().getString("button2");
/* 51 */            String string4 = getArguments().getString("button3");
/* 61 */            String string5 = getArguments().getString("message");
/* 75 */            this.f5830a = getArguments().getInt("id");
/* 91 */            AlertDialog.Builder neutralButton = new AlertDialog.Builder(gameApp, 4).setTitle(string).setMessage(string5).setNeutralButton(string2, bq0Var);
/* 99 */            if (!string3.isEmpty()) {
/* 101 */               neutralButton.setPositiveButton(string3, bq0Var);
                    }
/* 108 */           if (!string4.isEmpty()) {
/* 110 */               neutralButton.setNegativeButton(string4, bq0Var);
                    }
/* 113 */           return neutralButton.create();
                }

                @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
/* 1 */             super.onDismiss(dialogInterface);
/* 8 */             GameApp.getInstance().setSystemUiVisibility();
/* 14 */            m2735a(this.f5830a, 0);
                }

                public void startupDismiss() {
/* 2 */             this.f5831b = true;
                    try {
/* 4 */                 dismiss();
                    } catch (Exception e) {
/* 9 */                 GameApp.debuggerException(e);
                    }
/* 13 */            doDialogDismiss = false;
                }
            }
