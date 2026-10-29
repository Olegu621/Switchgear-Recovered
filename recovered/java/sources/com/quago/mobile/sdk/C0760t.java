            package com.quago.mobile.sdk;

            import android.hardware.input.InputManager;
            import android.view.InputDevice;
            import java.util.HashMap;
            import java.util.Locale;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.t */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0760t implements InputManager.InputDeviceListener {

                /* JADX INFO: renamed from: b */
                public final InputManager f5629b;

                /* JADX INFO: renamed from: a */
                public final C0740j0 f5628a = AbstractC0743k0.m2619a("InputDevicesManager");

                /* JADX INFO: renamed from: c */
                public final HashMap f5630c = new HashMap();

                public C0760t(InputManager inputManager) {
/* 19 */            this.f5629b = inputManager;
/* 21 */            if (inputManager == null) {
/* 75 */                return;
                    }
                    try {
/* 30 */                for (int i : inputManager.getInputDeviceIds()) {
                            try {
/* 36 */                        InputDevice inputDevice = this.f5629b.getInputDevice(i);
/* 40 */                        if (inputDevice != null) {
/* 54 */                            this.f5630c.put(Integer.valueOf(i), new C0737i0(i, inputDevice));
                                }
                            } catch (Exception e) {
/* 63 */                        this.f5628a.m2612a("InputDevicesManager-inner", e);
                            }
                        }
                    } catch (Exception e2) {
/* 72 */                this.f5628a.m2612a("InputDevicesManager", e2);
                    }
                }

                /* JADX INFO: renamed from: a */
                public final C0737i0 m2658a(int i) {
                    try {
/* 11 */                return (C0737i0) this.f5630c.get(Integer.valueOf(i));
                    } catch (Exception e) {
/* 19 */                this.f5628a.m2612a("getInputDevice", e);
/* 22 */                return null;
                    }
                }

                @Override // android.hardware.input.InputManager.InputDeviceListener
                public final void onInputDeviceAdded(int i) {
/* 3 */             InputManager inputManager = this.f5629b;
/* 5 */             if (inputManager == null) {
/* 7 */                 return;
                    }
                    try {
/* 14 */                C0737i0 c0737i0 = new C0737i0(i, inputManager.getInputDevice(i));
/* 23 */                this.f5630c.put(Integer.valueOf(i), c0737i0);
/* 40 */                this.f5628a.m2615d("onInputDeviceAdded", "DeviceId %s by the name '%s' - Added", Integer.valueOf(i), c0737i0.f5486g);
                    } catch (Exception e) {
/* 47 */                this.f5628a.m2612a("onInputDeviceAdded", e);
                    }
                }

                @Override // android.hardware.input.InputManager.InputDeviceListener
                public final void onInputDeviceChanged(int i) {
/* 3 */             InputManager inputManager = this.f5629b;
/* 5 */             if (inputManager == null) {
/* 7 */                 return;
                    }
                    try {
/* 14 */                C0737i0 c0737i0 = new C0737i0(i, inputManager.getInputDevice(i));
/* 23 */                this.f5630c.put(Integer.valueOf(i), c0737i0);
/* 40 */                this.f5628a.m2615d("onInputDeviceChanged", "DeviceId %s by the name '%s' - Changed", Integer.valueOf(i), c0737i0.f5486g);
                    } catch (Exception e) {
/* 47 */                this.f5628a.m2612a("onInputDeviceChanged", e);
                    }
                }

                @Override // android.hardware.input.InputManager.InputDeviceListener
                public final void onInputDeviceRemoved(int i) {
                    try {
/* 3 */                 QuagoSettings.LogLevel logLevel = QuagoSettings.LogLevel.VERBOSE;
/* 5 */                 Locale locale = AbstractC0743k0.f5509a;
/* 13 */                if (AbstractC0743k0.m2621a(logLevel.priority)) {
/* 15 */                    C0737i0 c0737i0M2658a = m2658a(i);
/* 19 */                    C0740j0 c0740j0 = this.f5628a;
/* 21 */                    if (c0737i0M2658a == null) {
/* 33 */                        c0740j0.m2615d("onInputDeviceRemoved", "DeviceId %s - Removed", Integer.valueOf(i));
                            } else {
/* 51 */                        c0740j0.m2615d("onInputDeviceRemoved", "DeviceId %s by the name '%s' - Removed", Integer.valueOf(i), c0737i0M2658a.f5486g);
                            }
                        }
                    } catch (Exception e) {
/* 57 */                this.f5628a.m2612a("onInputDeviceRemoved", e);
                    }
                }
            }
