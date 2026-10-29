            package com.supercell.p007id;

            import android.content.ClipData;
            import android.content.ClipDescription;
            import android.content.ClipboardManager;
            import android.content.Intent;
            import io.flutter.Log;
            import io.flutter.embedding.engine.systemchannels.PlatformChannel;
            import java.io.FileNotFoundException;
            import java.util.List;
            import p000.vk0;
            import p000.wk0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 19 */    public class FlutterPanelPlatformPlugin {
                private static final String TAG = "ViewPlatformPlugin";
                final PlatformChannel.PlatformMessageHandler mPlatformMessageHandler;
                private final PlatformChannel platformChannel;
                private final PlatformPluginDelegate platformPluginDelegate;
                private final FlutterPanel view;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface PlatformPluginDelegate {
                    boolean popSystemNavigator();
                }

                public FlutterPanelPlatformPlugin(FlutterPanel flutterPanel, PlatformChannel platformChannel, PlatformPluginDelegate platformPluginDelegate) {
/* 6 */             vk0 vk0Var = new vk0(this);
/* 9 */             this.mPlatformMessageHandler = vk0Var;
/* 11 */            this.view = flutterPanel;
/* 13 */            this.platformChannel = platformChannel;
/* 15 */            platformChannel.setPlatformMessageHandler(vk0Var);
/* 18 */            this.platformPluginDelegate = platformPluginDelegate;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public boolean clipboardHasStrings() {
                    ClipDescription primaryClipDescription;
/* 13 */            ClipboardManager clipboardManager = (ClipboardManager) this.view.getContext().getSystemService("clipboard");
/* 20 */            if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
/* 32 */                return primaryClipDescription.hasMimeType("text/*");
                    }
/* 19 */            return false;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public CharSequence getClipboardData(PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
/* 13 */            ClipboardManager clipboardManager = (ClipboardManager) this.view.getContext().getSystemService("clipboard");
/* 20 */            if (!clipboardManager.hasPrimaryClip()) {
/* 19 */                return null;
                    }
                    try {
/* 23 */                ClipData primaryClip = clipboardManager.getPrimaryClip();
/* 27 */                if (primaryClip == null) {
/* 19 */                    return null;
                        }
/* 30 */                if (clipboardContentFormat != null && clipboardContentFormat != PlatformChannel.ClipboardContentFormat.PLAIN_TEXT) {
/* 19 */                    return null;
                        }
/* 41 */                ClipData.Item itemAt = primaryClip.getItemAt(0);
/* 49 */                if (itemAt.getUri() != null) {
/* 67 */                    this.view.getContext().getContentResolver().openTypedAssetFileDescriptor(itemAt.getUri(), "text/*", null);
                        }
/* 76 */                return itemAt.coerceToText(this.view.getContext());
                    } catch (FileNotFoundException unused) {
/* 19 */                return null;
                    } catch (SecurityException e) {
/* 86 */                Log.m4592w(TAG, "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e);
/* 19 */                return null;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void playSystemSound(PlatformChannel.SoundType soundType) {
/* 3 */             if (soundType == PlatformChannel.SoundType.CLICK) {
/* 8 */                 this.view.playSoundEffect(0);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void popSystemNavigator() {
/* 1 */             PlatformPluginDelegate platformPluginDelegate = this.platformPluginDelegate;
/* 3 */             if (platformPluginDelegate == null || !platformPluginDelegate.popSystemNavigator()) {
/* 14 */                this.view.destroy();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void restoreSystemChromeSystemUIOverlays() {
/* 1 */             updateSystemUiOverlays();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setClipboardData(String str) {
/* 21 */            ((ClipboardManager) this.view.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setSystemChromeApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription appSwitcherDescription) {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setSystemChromeChangeListener() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setSystemChromeEnabledSystemUIMode(PlatformChannel.SystemUiMode systemUiMode) {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setSystemChromeEnabledSystemUIOverlays(List<PlatformChannel.SystemUiOverlay> list) {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setSystemChromePreferredOrientations(int i) {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setSystemChromeSystemUIOverlayStyle(PlatformChannel.SystemChromeStyle systemChromeStyle) {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void share(String str) {
/* 3 */             Intent intent = new Intent();
/* 8 */             intent.setAction("android.intent.action.SEND");
/* 13 */            intent.setType("text/plain");
/* 18 */            intent.putExtra("android.intent.extra.TEXT", str);
/* 32 */            this.view.getContext().startActivity(Intent.createChooser(intent, null));
                }

                public void destroy() {
/* 4 */             this.platformChannel.setPlatformMessageHandler(null);
                }

                public void updateSystemUiOverlays() {
                }

                public void vibrateHapticFeedback(PlatformChannel.HapticFeedbackType hapticFeedbackType) {
/* 7 */             int i = wk0.f18669a[hapticFeedbackType.ordinal()];
/* 10 */            if (i == 1) {
/* 53 */                this.view.performHapticFeedback(0);
/* 56 */                return;
                    }
/* 13 */            if (i == 2) {
/* 46 */                this.view.performHapticFeedback(1);
/* 49 */                return;
                    }
/* 16 */            if (i == 3) {
/* 40 */                this.view.performHapticFeedback(3);
                    } else if (i == 4) {
/* 34 */                this.view.performHapticFeedback(6);
                    } else {
/* 22 */                if (i != 5) {
/* 24 */                    return;
                        }
/* 27 */                this.view.performHapticFeedback(4);
                    }
                }

/* 20 */        public FlutterPanelPlatformPlugin(FlutterPanel flutterPanel, PlatformChannel platformChannel) {
/* 21 */            this(flutterPanel, platformChannel, null);
                }
            }
