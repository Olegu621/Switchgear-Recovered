            package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

            import android.hardware.display.DisplayManager;
            import android.os.Build;
            import java.lang.reflect.Field;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class DisplayListenerProxy {
                private static final String TAG = "DisplayListenerProxy";
                private ArrayList<DisplayManager.DisplayListener> listenersBeforeWebView;

                private static ArrayList<DisplayManager.DisplayListener> yoinkDisplayListeners(DisplayManager displayManager) {
/* 5 */             if (Build.VERSION.SDK_INT >= 28) {
/* 9 */                 return new ArrayList<>();
                    }
                    try {
/* 17 */                Field declaredField = DisplayManager.class.getDeclaredField("mGlobal");
/* 22 */                declaredField.setAccessible(true);
/* 25 */                Object obj = declaredField.get(displayManager);
/* 35 */                Field declaredField2 = obj.getClass().getDeclaredField("mDisplayListeners");
/* 39 */                declaredField2.setAccessible(true);
/* 46 */                ArrayList arrayList = (ArrayList) declaredField2.get(obj);
/* 50 */                ArrayList<DisplayManager.DisplayListener> arrayList2 = new ArrayList<>();
/* 57 */                Field field = null;
/* 62 */                for (Object obj2 : arrayList) {
/* 68 */                    if (field == null) {
/* 76 */                        field = obj2.getClass().getField("mListener");
/* 80 */                        field.setAccessible(true);
                            }
/* 89 */                    arrayList2.add((DisplayManager.DisplayListener) field.get(obj2));
                        }
/* 93 */                return arrayList2;
                    } catch (IllegalAccessException | NoSuchFieldException e) {
/* 97 */                e.toString();
/* 102 */               return new ArrayList<>();
                    }
                }

                public void onPostWebViewInitialization(final DisplayManager displayManager) {
/* 1 */             final ArrayList<DisplayManager.DisplayListener> arrayListYoinkDisplayListeners = yoinkDisplayListeners(displayManager);
/* 7 */             arrayListYoinkDisplayListeners.removeAll(this.listenersBeforeWebView);
/* 14 */            if (arrayListYoinkDisplayListeners.isEmpty()) {
/* 46 */                return;
                    }
/* 17 */            Iterator<DisplayManager.DisplayListener> it = arrayListYoinkDisplayListeners.iterator();
/* 25 */            while (it.hasNext()) {
/* 33 */                displayManager.unregisterDisplayListener(it.next());
/* 42 */                displayManager.registerDisplayListener(new DisplayManager.DisplayListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.DisplayListenerProxy.1
                            @Override // android.hardware.display.DisplayManager.DisplayListener
                            public void onDisplayAdded(int i) {
/* 3 */                         Iterator it2 = arrayListYoinkDisplayListeners.iterator();
/* 11 */                        while (it2.hasNext()) {
/* 19 */                            ((DisplayManager.DisplayListener) it2.next()).onDisplayAdded(i);
                                }
                            }

                            @Override // android.hardware.display.DisplayManager.DisplayListener
                            public void onDisplayChanged(int i) {
/* 7 */                         if (displayManager.getDisplay(i) == null) {
/* 32 */                            return;
                                }
/* 12 */                        Iterator it2 = arrayListYoinkDisplayListeners.iterator();
/* 20 */                        while (it2.hasNext()) {
/* 28 */                            ((DisplayManager.DisplayListener) it2.next()).onDisplayChanged(i);
                                }
                            }

                            @Override // android.hardware.display.DisplayManager.DisplayListener
                            public void onDisplayRemoved(int i) {
/* 3 */                         Iterator it2 = arrayListYoinkDisplayListeners.iterator();
/* 11 */                        while (it2.hasNext()) {
/* 19 */                            ((DisplayManager.DisplayListener) it2.next()).onDisplayRemoved(i);
                                }
                            }
                        }, null);
                    }
                }

                public void onPreWebViewInitialization(DisplayManager displayManager) {
/* 5 */             this.listenersBeforeWebView = yoinkDisplayListeners(displayManager);
                }
            }
