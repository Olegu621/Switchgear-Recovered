            package io.flutter.embedding.engine;

            import android.app.Activity;
            import android.app.Service;
            import android.content.BroadcastReceiver;
            import android.content.ContentProvider;
            import android.content.Context;
            import android.content.Intent;
            import android.os.Bundle;
            import io.flutter.Log;
            import io.flutter.embedding.android.ExclusiveAppComponent;
            import io.flutter.embedding.engine.loader.FlutterLoader;
            import io.flutter.embedding.engine.plugins.FlutterPlugin;
            import io.flutter.embedding.engine.plugins.PluginRegistry;
            import io.flutter.embedding.engine.plugins.activity.ActivityAware;
            import io.flutter.embedding.engine.plugins.activity.ActivityControlSurface;
            import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
            import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverAware;
            import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface;
            import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverPluginBinding;
            import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderAware;
            import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface;
            import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderPluginBinding;
            import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
            import io.flutter.embedding.engine.plugins.service.ServiceAware;
            import io.flutter.embedding.engine.plugins.service.ServiceControlSurface;
            import io.flutter.embedding.engine.plugins.service.ServicePluginBinding;
            import io.flutter.util.TraceSection;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            import p000.v61;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     class FlutterEngineConnectionRegistry implements PluginRegistry, ActivityControlSurface, ServiceControlSurface, BroadcastReceiverControlSurface, ContentProviderControlSurface {
                private static final String TAG = "FlutterEngineCxnRegstry";
                private FlutterEngineActivityPluginBinding activityPluginBinding;
                private BroadcastReceiver broadcastReceiver;
                private FlutterEngineBroadcastReceiverPluginBinding broadcastReceiverPluginBinding;
                private ContentProvider contentProvider;
                private FlutterEngineContentProviderPluginBinding contentProviderPluginBinding;
                private ExclusiveAppComponent<Activity> exclusiveActivity;
                private final FlutterEngine flutterEngine;
                private final FlutterPlugin.FlutterPluginBinding pluginBinding;
                private Service service;
                private FlutterEngineServicePluginBinding servicePluginBinding;
                private final Map<Class<? extends FlutterPlugin>, FlutterPlugin> plugins = new HashMap();
                private final Map<Class<? extends FlutterPlugin>, ActivityAware> activityAwarePlugins = new HashMap();
                private boolean isWaitingForActivityReattachment = false;
                private final Map<Class<? extends FlutterPlugin>, ServiceAware> serviceAwarePlugins = new HashMap();
                private final Map<Class<? extends FlutterPlugin>, BroadcastReceiverAware> broadcastReceiverAwarePlugins = new HashMap();
                private final Map<Class<? extends FlutterPlugin>, ContentProviderAware> contentProviderAwarePlugins = new HashMap();

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class FlutterEngineActivityPluginBinding implements ActivityPluginBinding {
                    private final Activity activity;
                    private final HiddenLifecycleReference hiddenLifecycleReference;
                    private final Set<io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener> onRequestPermissionsResultListeners = new HashSet();
                    private final Set<io.flutter.plugin.common.PluginRegistry.ActivityResultListener> onActivityResultListeners = new HashSet();
                    private final Set<io.flutter.plugin.common.PluginRegistry.NewIntentListener> onNewIntentListeners = new HashSet();
                    private final Set<io.flutter.plugin.common.PluginRegistry.UserLeaveHintListener> onUserLeaveHintListeners = new HashSet();
                    private final Set<io.flutter.plugin.common.PluginRegistry.WindowFocusChangedListener> onWindowFocusChangedListeners = new HashSet();
                    private final Set<ActivityPluginBinding.OnSaveInstanceStateListener> onSaveInstanceStateListeners = new HashSet();

                    public FlutterEngineActivityPluginBinding(Activity activity, v61 v61Var) {
/* 46 */                this.activity = activity;
/* 53 */                this.hiddenLifecycleReference = new HiddenLifecycleReference(v61Var);
                    }

                    @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
                    public void addActivityResultListener(io.flutter.plugin.common.PluginRegistry.ActivityResultListener activityResultListener) {
/* 3 */                 this.onActivityResultListeners.add(activityResultListener);
                    }

                    @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
                    public void addOnNewIntentListener(io.flutter.plugin.common.PluginRegistry.NewIntentListener newIntentListener) {
/* 3 */                 this.onNewIntentListeners.add(newIntentListener);
                    }

                    @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
                    public void addOnSaveStateListener(ActivityPluginBinding.OnSaveInstanceStateListener onSaveInstanceStateListener) {
/* 3 */                 this.onSaveInstanceStateListeners.add(onSaveInstanceStateListener);
                    }

                    @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
                    public void addOnUserLeaveHintListener(io.flutter.plugin.common.PluginRegistry.UserLeaveHintListener userLeaveHintListener) {
/* 3 */                 this.onUserLeaveHintListeners.add(userLeaveHintListener);
                    }

                    @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
                    public void addOnWindowFocusChangedListener(io.flutter.plugin.common.PluginRegistry.WindowFocusChangedListener windowFocusChangedListener) {
/* 3 */                 this.onWindowFocusChangedListeners.add(windowFocusChangedListener);
                    }

                    @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
                    public void addRequestPermissionsResultListener(io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener) {
/* 3 */                 this.onRequestPermissionsResultListeners.add(requestPermissionsResultListener);
                    }

                    @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
                    public Activity getActivity() {
/* 1 */                 return this.activity;
                    }

                    @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
                    public Object getLifecycle() {
/* 1 */                 return this.hiddenLifecycleReference;
                    }

                    public boolean onActivityResult(int i, int i2, Intent intent) {
/* 8 */                 Iterator it = new HashSet(this.onActivityResultListeners).iterator();
                        while (true) {
/* 13 */                    boolean z = false;
/* 18 */                    while (it.hasNext()) {
/* 30 */                        if (((io.flutter.plugin.common.PluginRegistry.ActivityResultListener) it.next()).onActivityResult(i, i2, intent) || z) {
/* 34 */                            z = true;
                                }
                            }
/* 36 */                    return z;
                        }
                    }

                    public void onNewIntent(Intent intent) {
/* 3 */                 Iterator<io.flutter.plugin.common.PluginRegistry.NewIntentListener> it = this.onNewIntentListeners.iterator();
/* 11 */                while (it.hasNext()) {
/* 19 */                    it.next().onNewIntent(intent);
                        }
                    }

                    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
/* 3 */                 Iterator<io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener> it = this.onRequestPermissionsResultListeners.iterator();
                        while (true) {
/* 8 */                     boolean z = false;
/* 13 */                    while (it.hasNext()) {
/* 25 */                        if (it.next().onRequestPermissionsResult(i, strArr, iArr) || z) {
/* 29 */                            z = true;
                                }
                            }
/* 31 */                    return z;
                        }
                    }

                    public void onRestoreInstanceState(Bundle bundle) {
/* 3 */                 Iterator<ActivityPluginBinding.OnSaveInstanceStateListener> it = this.onSaveInstanceStateListeners.iterator();
/* 11 */                while (it.hasNext()) {
/* 19 */                    it.next().onRestoreInstanceState(bundle);
                        }
                    }

                    public void onSaveInstanceState(Bundle bundle) {
/* 3 */                 Iterator<ActivityPluginBinding.OnSaveInstanceStateListener> it = this.onSaveInstanceStateListeners.iterator();
/* 11 */                while (it.hasNext()) {
/* 19 */                    it.next().onSaveInstanceState(bundle);
                        }
                    }

                    public void onUserLeaveHint() {
/* 3 */                 Iterator<io.flutter.plugin.common.PluginRegistry.UserLeaveHintListener> it = this.onUserLeaveHintListeners.iterator();
/* 11 */                while (it.hasNext()) {
/* 19 */                    it.next().onUserLeaveHint();
                        }
                    }

                    public void onWindowFocusChanged(boolean z) {
/* 3 */                 Iterator<io.flutter.plugin.common.PluginRegistry.WindowFocusChangedListener> it = this.onWindowFocusChangedListeners.iterator();
/* 11 */                while (it.hasNext()) {
/* 19 */                    it.next().onWindowFocusChanged(z);
                        }
                    }

                    @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
                    public void removeActivityResultListener(io.flutter.plugin.common.PluginRegistry.ActivityResultListener activityResultListener) {
/* 3 */                 this.onActivityResultListeners.remove(activityResultListener);
                    }

                    @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
                    public void removeOnNewIntentListener(io.flutter.plugin.common.PluginRegistry.NewIntentListener newIntentListener) {
/* 3 */                 this.onNewIntentListeners.remove(newIntentListener);
                    }

                    @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
                    public void removeOnSaveStateListener(ActivityPluginBinding.OnSaveInstanceStateListener onSaveInstanceStateListener) {
/* 3 */                 this.onSaveInstanceStateListeners.remove(onSaveInstanceStateListener);
                    }

                    @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
                    public void removeOnUserLeaveHintListener(io.flutter.plugin.common.PluginRegistry.UserLeaveHintListener userLeaveHintListener) {
/* 3 */                 this.onUserLeaveHintListeners.remove(userLeaveHintListener);
                    }

                    @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
                    public void removeOnWindowFocusChangedListener(io.flutter.plugin.common.PluginRegistry.WindowFocusChangedListener windowFocusChangedListener) {
/* 3 */                 this.onWindowFocusChangedListeners.remove(windowFocusChangedListener);
                    }

                    @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
                    public void removeRequestPermissionsResultListener(io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener) {
/* 3 */                 this.onRequestPermissionsResultListeners.remove(requestPermissionsResultListener);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class FlutterEngineBroadcastReceiverPluginBinding implements BroadcastReceiverPluginBinding {
                    private final BroadcastReceiver broadcastReceiver;

                    public FlutterEngineBroadcastReceiverPluginBinding(BroadcastReceiver broadcastReceiver) {
/* 4 */                 this.broadcastReceiver = broadcastReceiver;
                    }

                    @Override // io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverPluginBinding
                    public BroadcastReceiver getBroadcastReceiver() {
/* 1 */                 return this.broadcastReceiver;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class FlutterEngineContentProviderPluginBinding implements ContentProviderPluginBinding {
                    private final ContentProvider contentProvider;

                    public FlutterEngineContentProviderPluginBinding(ContentProvider contentProvider) {
/* 4 */                 this.contentProvider = contentProvider;
                    }

                    @Override // io.flutter.embedding.engine.plugins.contentprovider.ContentProviderPluginBinding
                    public ContentProvider getContentProvider() {
/* 1 */                 return this.contentProvider;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class FlutterEngineServicePluginBinding implements ServicePluginBinding {
                    private final HiddenLifecycleReference hiddenLifecycleReference;
                    private final Set<ServiceAware.OnModeChangeListener> onModeChangeListeners = new HashSet();
                    private final Service service;

                    public FlutterEngineServicePluginBinding(Service service, v61 v61Var) {
/* 11 */                this.service = service;
/* 22 */                this.hiddenLifecycleReference = v61Var != null ? new HiddenLifecycleReference(v61Var) : null;
                    }

                    @Override // io.flutter.embedding.engine.plugins.service.ServicePluginBinding
                    public void addOnModeChangeListener(ServiceAware.OnModeChangeListener onModeChangeListener) {
/* 3 */                 this.onModeChangeListeners.add(onModeChangeListener);
                    }

                    @Override // io.flutter.embedding.engine.plugins.service.ServicePluginBinding
                    public Object getLifecycle() {
/* 1 */                 return this.hiddenLifecycleReference;
                    }

                    @Override // io.flutter.embedding.engine.plugins.service.ServicePluginBinding
                    public Service getService() {
/* 1 */                 return this.service;
                    }

                    public void onMoveToBackground() {
/* 3 */                 Iterator<ServiceAware.OnModeChangeListener> it = this.onModeChangeListeners.iterator();
/* 11 */                while (it.hasNext()) {
/* 19 */                    it.next().onMoveToBackground();
                        }
                    }

                    public void onMoveToForeground() {
/* 3 */                 Iterator<ServiceAware.OnModeChangeListener> it = this.onModeChangeListeners.iterator();
/* 11 */                while (it.hasNext()) {
/* 19 */                    it.next().onMoveToForeground();
                        }
                    }

                    @Override // io.flutter.embedding.engine.plugins.service.ServicePluginBinding
                    public void removeOnModeChangeListener(ServiceAware.OnModeChangeListener onModeChangeListener) {
/* 3 */                 this.onModeChangeListeners.remove(onModeChangeListener);
                    }
                }

                public FlutterEngineConnectionRegistry(Context context, FlutterEngine flutterEngine, FlutterLoader flutterLoader, FlutterEngineGroup flutterEngineGroup) {
/* 42 */            this.flutterEngine = flutterEngine;
/* 74 */            this.pluginBinding = new FlutterPlugin.FlutterPluginBinding(context, flutterEngine, flutterEngine.getDartExecutor(), flutterEngine.getRenderer(), flutterEngine.getPlatformViewsController().getRegistry(), new DefaultFlutterAssets(flutterLoader), flutterEngineGroup);
                }

                private void attachToActivityInternal(Activity activity, v61 v61Var) {
/* 6 */             this.activityPluginBinding = new FlutterEngineActivityPluginBinding(activity, v61Var);
/* 33 */            this.flutterEngine.getPlatformViewsController().setSoftwareRendering(activity.getIntent() != null ? activity.getIntent().getBooleanExtra(FlutterShellArgs.ARG_KEY_ENABLE_SOFTWARE_RENDERING, false) : false);
/* 54 */            this.flutterEngine.getPlatformViewsController().attach(activity, this.flutterEngine.getRenderer(), this.flutterEngine.getDartExecutor());
/* 69 */            this.flutterEngine.getPlatformViewsController2().attach(activity, this.flutterEngine.getDartExecutor());
/* 86 */            for (ActivityAware activityAware : this.activityAwarePlugins.values()) {
/* 94 */                boolean z = this.isWaitingForActivityReattachment;
/* 96 */                FlutterEngineActivityPluginBinding flutterEngineActivityPluginBinding = this.activityPluginBinding;
/* 98 */                if (z) {
/* 100 */                   activityAware.onReattachedToActivityForConfigChanges(flutterEngineActivityPluginBinding);
                        } else {
/* 104 */                   activityAware.onAttachedToActivity(flutterEngineActivityPluginBinding);
                        }
                    }
/* 108 */           this.isWaitingForActivityReattachment = false;
                }

                private Activity attachedActivity() {
/* 1 */             ExclusiveAppComponent<Activity> exclusiveAppComponent = this.exclusiveActivity;
/* 3 */             if (exclusiveAppComponent != null) {
/* 5 */                 return exclusiveAppComponent.getAppComponent();
                    }
/* 12 */            return null;
                }

                private void detachFromActivityInternal() {
/* 7 */             this.flutterEngine.getPlatformViewsController().detach();
/* 16 */            this.flutterEngine.getPlatformViewsController2().detach();
/* 20 */            this.exclusiveActivity = null;
/* 22 */            this.activityPluginBinding = null;
                }

                private void detachFromAppComponent() {
/* 5 */             if (isAttachedToActivity()) {
/* 7 */                 detachFromActivity();
/* 10 */                return;
                    }
/* 15 */            if (isAttachedToService()) {
/* 17 */                detachFromService();
                    } else if (isAttachedToBroadcastReceiver()) {
/* 27 */                detachFromBroadcastReceiver();
                    } else if (isAttachedToContentProvider()) {
/* 37 */                detachFromContentProvider();
                    }
                }

                private boolean isAttachedToActivity() {
                    return this.exclusiveActivity != null;
                }

                private boolean isAttachedToBroadcastReceiver() {
                    return this.broadcastReceiver != null;
                }

                private boolean isAttachedToContentProvider() {
                    return this.contentProvider != null;
                }

                private boolean isAttachedToService() {
                    return this.service != null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.flutter.embedding.engine.plugins.PluginRegistry
                public void add(FlutterPlugin flutterPlugin) {
/* 19 */            TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#add ".concat(flutterPlugin.getClass().getSimpleName()));
                    try {
/* 33 */                if (has(flutterPlugin.getClass())) {
/* 62 */                    Log.m4591w(TAG, "Attempted to register plugin (" + flutterPlugin + ") but it was already registered with this FlutterEngine (" + this.flutterEngine + ").");
/* 65 */                    if (traceSectionScoped != null) {
/* 67 */                        traceSectionScoped.close();
/* 70 */                        return;
                            }
/* 216 */                   return;
                        }
/* 86 */                Log.m4589v(TAG, "Adding plugin: " + flutterPlugin);
/* 95 */                this.plugins.put((Class<? extends FlutterPlugin>) flutterPlugin.getClass(), flutterPlugin);
/* 100 */               flutterPlugin.onAttachedToEngine(this.pluginBinding);
/* 105 */               if (flutterPlugin instanceof ActivityAware) {
/* 108 */                   ActivityAware activityAware = (ActivityAware) flutterPlugin;
/* 116 */                   this.activityAwarePlugins.put((Class<? extends FlutterPlugin>) flutterPlugin.getClass(), activityAware);
/* 123 */                   if (isAttachedToActivity()) {
/* 127 */                       activityAware.onAttachedToActivity(this.activityPluginBinding);
                            }
                        }
/* 132 */               if (flutterPlugin instanceof ServiceAware) {
/* 135 */                   ServiceAware serviceAware = (ServiceAware) flutterPlugin;
/* 143 */                   this.serviceAwarePlugins.put((Class<? extends FlutterPlugin>) flutterPlugin.getClass(), serviceAware);
/* 150 */                   if (isAttachedToService()) {
/* 154 */                       serviceAware.onAttachedToService(this.servicePluginBinding);
                            }
                        }
/* 159 */               if (flutterPlugin instanceof BroadcastReceiverAware) {
/* 162 */                   BroadcastReceiverAware broadcastReceiverAware = (BroadcastReceiverAware) flutterPlugin;
/* 170 */                   this.broadcastReceiverAwarePlugins.put((Class<? extends FlutterPlugin>) flutterPlugin.getClass(), broadcastReceiverAware);
/* 177 */                   if (isAttachedToBroadcastReceiver()) {
/* 181 */                       broadcastReceiverAware.onAttachedToBroadcastReceiver(this.broadcastReceiverPluginBinding);
                            }
                        }
/* 186 */               if (flutterPlugin instanceof ContentProviderAware) {
/* 189 */                   ContentProviderAware contentProviderAware = (ContentProviderAware) flutterPlugin;
/* 197 */                   this.contentProviderAwarePlugins.put((Class<? extends FlutterPlugin>) flutterPlugin.getClass(), contentProviderAware);
/* 204 */                   if (isAttachedToContentProvider()) {
/* 208 */                       contentProviderAware.onAttachedToContentProvider(this.contentProviderPluginBinding);
                            }
                        }
/* 211 */               if (traceSectionScoped != null) {
/* 213 */                   traceSectionScoped.close();
                        }
                    } catch (Throwable th) {
/* 217 */               if (traceSectionScoped != null) {
                            try {
/* 219 */                       traceSectionScoped.close();
                            } catch (Throwable th2) {
/* 224 */                       th.addSuppressed(th2);
                            }
                        }
/* 227 */               throw th;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
                public void attachToActivity(ExclusiveAppComponent<Activity> exclusiveAppComponent, v61 v61Var) {
/* 3 */             TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#attachToActivity");
                    try {
/* 7 */                 ExclusiveAppComponent<Activity> exclusiveAppComponent2 = this.exclusiveActivity;
/* 9 */                 if (exclusiveAppComponent2 != null) {
/* 11 */                    exclusiveAppComponent2.detachFromFlutterEngine();
                        }
/* 17 */                detachFromAppComponent();
/* 20 */                this.exclusiveActivity = exclusiveAppComponent;
/* 28 */                attachToActivityInternal(exclusiveAppComponent.getAppComponent(), v61Var);
/* 31 */                if (traceSectionScoped != null) {
/* 33 */                    traceSectionScoped.close();
                        }
                    } catch (Throwable th) {
/* 37 */                if (traceSectionScoped != null) {
                            try {
/* 39 */                        traceSectionScoped.close();
                            } catch (Throwable th2) {
/* 44 */                        th.addSuppressed(th2);
                            }
                        }
/* 47 */                throw th;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface
                public void attachToBroadcastReceiver(BroadcastReceiver broadcastReceiver, v61 v61Var) {
/* 3 */             TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#attachToBroadcastReceiver");
                    try {
/* 7 */                 detachFromAppComponent();
/* 10 */                this.broadcastReceiver = broadcastReceiver;
/* 17 */                this.broadcastReceiverPluginBinding = new FlutterEngineBroadcastReceiverPluginBinding(broadcastReceiver);
/* 25 */                Iterator<BroadcastReceiverAware> it = this.broadcastReceiverAwarePlugins.values().iterator();
/* 33 */                while (it.hasNext()) {
/* 43 */                    it.next().onAttachedToBroadcastReceiver(this.broadcastReceiverPluginBinding);
                        }
/* 49 */                if (traceSectionScoped != null) {
/* 51 */                    traceSectionScoped.close();
                        }
                    } catch (Throwable th) {
/* 55 */                if (traceSectionScoped != null) {
                            try {
/* 57 */                        traceSectionScoped.close();
                            } catch (Throwable th2) {
/* 62 */                        th.addSuppressed(th2);
                            }
                        }
/* 65 */                throw th;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface
                public void attachToContentProvider(ContentProvider contentProvider, v61 v61Var) {
/* 3 */             TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#attachToContentProvider");
                    try {
/* 7 */                 detachFromAppComponent();
/* 10 */                this.contentProvider = contentProvider;
/* 17 */                this.contentProviderPluginBinding = new FlutterEngineContentProviderPluginBinding(contentProvider);
/* 25 */                Iterator<ContentProviderAware> it = this.contentProviderAwarePlugins.values().iterator();
/* 33 */                while (it.hasNext()) {
/* 43 */                    it.next().onAttachedToContentProvider(this.contentProviderPluginBinding);
                        }
/* 49 */                if (traceSectionScoped != null) {
/* 51 */                    traceSectionScoped.close();
                        }
                    } catch (Throwable th) {
/* 55 */                if (traceSectionScoped != null) {
                            try {
/* 57 */                        traceSectionScoped.close();
                            } catch (Throwable th2) {
/* 62 */                        th.addSuppressed(th2);
                            }
                        }
/* 65 */                throw th;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.service.ServiceControlSurface
                public void attachToService(Service service, v61 v61Var, boolean z) {
/* 3 */             TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#attachToService");
                    try {
/* 7 */                 detachFromAppComponent();
/* 10 */                this.service = service;
/* 17 */                this.servicePluginBinding = new FlutterEngineServicePluginBinding(service, v61Var);
/* 25 */                Iterator<ServiceAware> it = this.serviceAwarePlugins.values().iterator();
/* 33 */                while (it.hasNext()) {
/* 43 */                    it.next().onAttachedToService(this.servicePluginBinding);
                        }
/* 49 */                if (traceSectionScoped != null) {
/* 51 */                    traceSectionScoped.close();
                        }
                    } catch (Throwable th) {
/* 55 */                if (traceSectionScoped != null) {
                            try {
/* 57 */                        traceSectionScoped.close();
                            } catch (Throwable th2) {
/* 62 */                        th.addSuppressed(th2);
                            }
                        }
/* 65 */                throw th;
                    }
                }

                public void destroy() {
/* 5 */             Log.m4589v(TAG, "Destroying.");
/* 8 */             detachFromAppComponent();
/* 11 */            removeAll();
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
                public void detachFromActivity() {
/* 5 */             if (!isAttachedToActivity()) {
/* 65 */                Log.m4585e(TAG, "Attempted to detach plugins from an Activity when no Activity was attached.");
/* 68 */                return;
                    }
/* 9 */             TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#detachFromActivity");
                    try {
/* 19 */                Iterator<ActivityAware> it = this.activityAwarePlugins.values().iterator();
/* 27 */                while (it.hasNext()) {
/* 35 */                    it.next().onDetachedFromActivity();
                        }
/* 41 */                detachFromActivityInternal();
/* 44 */                if (traceSectionScoped != null) {
/* 46 */                    traceSectionScoped.close();
                        }
                    } catch (Throwable th) {
/* 50 */                if (traceSectionScoped != null) {
                            try {
/* 52 */                        traceSectionScoped.close();
                            } catch (Throwable th2) {
/* 57 */                        th.addSuppressed(th2);
                            }
                        }
/* 60 */                throw th;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
                public void detachFromActivityForConfigChanges() {
/* 5 */             if (!isAttachedToActivity()) {
/* 68 */                Log.m4585e(TAG, "Attempted to detach plugins from an Activity when no Activity was attached.");
/* 71 */                return;
                    }
/* 9 */             TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
/* 14 */                this.isWaitingForActivityReattachment = true;
/* 22 */                Iterator<ActivityAware> it = this.activityAwarePlugins.values().iterator();
/* 30 */                while (it.hasNext()) {
/* 38 */                    it.next().onDetachedFromActivityForConfigChanges();
                        }
/* 44 */                detachFromActivityInternal();
/* 47 */                if (traceSectionScoped != null) {
/* 49 */                    traceSectionScoped.close();
                        }
                    } catch (Throwable th) {
/* 53 */                if (traceSectionScoped != null) {
                            try {
/* 55 */                        traceSectionScoped.close();
                            } catch (Throwable th2) {
/* 60 */                        th.addSuppressed(th2);
                            }
                        }
/* 63 */                throw th;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface
                public void detachFromBroadcastReceiver() {
/* 5 */             if (!isAttachedToBroadcastReceiver()) {
/* 62 */                Log.m4585e(TAG, "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
/* 65 */                return;
                    }
/* 9 */             TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
                    try {
/* 19 */                Iterator<BroadcastReceiverAware> it = this.broadcastReceiverAwarePlugins.values().iterator();
/* 27 */                while (it.hasNext()) {
/* 35 */                    it.next().onDetachedFromBroadcastReceiver();
                        }
/* 41 */                if (traceSectionScoped != null) {
/* 43 */                    traceSectionScoped.close();
                        }
                    } catch (Throwable th) {
/* 47 */                if (traceSectionScoped != null) {
                            try {
/* 49 */                        traceSectionScoped.close();
                            } catch (Throwable th2) {
/* 54 */                        th.addSuppressed(th2);
                            }
                        }
/* 57 */                throw th;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface
                public void detachFromContentProvider() {
/* 5 */             if (!isAttachedToContentProvider()) {
/* 62 */                Log.m4585e(TAG, "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
/* 65 */                return;
                    }
/* 9 */             TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#detachFromContentProvider");
                    try {
/* 19 */                Iterator<ContentProviderAware> it = this.contentProviderAwarePlugins.values().iterator();
/* 27 */                while (it.hasNext()) {
/* 35 */                    it.next().onDetachedFromContentProvider();
                        }
/* 41 */                if (traceSectionScoped != null) {
/* 43 */                    traceSectionScoped.close();
                        }
                    } catch (Throwable th) {
/* 47 */                if (traceSectionScoped != null) {
                            try {
/* 49 */                        traceSectionScoped.close();
                            } catch (Throwable th2) {
/* 54 */                        th.addSuppressed(th2);
                            }
                        }
/* 57 */                throw th;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.service.ServiceControlSurface
                public void detachFromService() {
/* 5 */             if (!isAttachedToService()) {
/* 67 */                Log.m4585e(TAG, "Attempted to detach plugins from a Service when no Service was attached.");
/* 70 */                return;
                    }
/* 9 */             TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#detachFromService");
                    try {
/* 19 */                Iterator<ServiceAware> it = this.serviceAwarePlugins.values().iterator();
/* 27 */                while (it.hasNext()) {
/* 35 */                    it.next().onDetachedFromService();
                        }
/* 42 */                this.service = null;
/* 44 */                this.servicePluginBinding = null;
/* 46 */                if (traceSectionScoped != null) {
/* 48 */                    traceSectionScoped.close();
                        }
                    } catch (Throwable th) {
/* 52 */                if (traceSectionScoped != null) {
                            try {
/* 54 */                        traceSectionScoped.close();
                            } catch (Throwable th2) {
/* 59 */                        th.addSuppressed(th2);
                            }
                        }
/* 62 */                throw th;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.PluginRegistry
                public FlutterPlugin get(Class<? extends FlutterPlugin> cls) {
/* 3 */             return this.plugins.get(cls);
                }

                @Override // io.flutter.embedding.engine.plugins.PluginRegistry
                public boolean has(Class<? extends FlutterPlugin> cls) {
/* 3 */             return this.plugins.containsKey(cls);
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
                public boolean onActivityResult(int i, int i2, Intent intent) {
/* 5 */             if (!isAttachedToActivity()) {
/* 41 */                Log.m4585e(TAG, "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
/* 44 */                return false;
                    }
/* 9 */             TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#onActivityResult");
                    try {
/* 15 */                boolean zOnActivityResult = this.activityPluginBinding.onActivityResult(i, i2, intent);
/* 19 */                if (traceSectionScoped != null) {
/* 21 */                    traceSectionScoped.close();
                        }
/* 24 */                return zOnActivityResult;
                    } catch (Throwable th) {
/* 26 */                if (traceSectionScoped != null) {
                            try {
/* 28 */                        traceSectionScoped.close();
                            } catch (Throwable th2) {
/* 33 */                        th.addSuppressed(th2);
                            }
                        }
/* 36 */                throw th;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.service.ServiceControlSurface
                public void onMoveToBackground() {
/* 5 */             if (isAttachedToService()) {
/* 9 */                 TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#onMoveToBackground");
                        try {
/* 15 */                    this.servicePluginBinding.onMoveToBackground();
/* 18 */                    if (traceSectionScoped != null) {
/* 20 */                        traceSectionScoped.close();
                            }
                        } catch (Throwable th) {
/* 25 */                    if (traceSectionScoped != null) {
                                try {
/* 27 */                            traceSectionScoped.close();
                                } catch (Throwable th2) {
/* 32 */                            th.addSuppressed(th2);
                                }
                            }
/* 35 */                    throw th;
                        }
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.service.ServiceControlSurface
                public void onMoveToForeground() {
/* 5 */             if (isAttachedToService()) {
/* 9 */                 TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#onMoveToForeground");
                        try {
/* 15 */                    this.servicePluginBinding.onMoveToForeground();
/* 18 */                    if (traceSectionScoped != null) {
/* 20 */                        traceSectionScoped.close();
                            }
                        } catch (Throwable th) {
/* 25 */                    if (traceSectionScoped != null) {
                                try {
/* 27 */                            traceSectionScoped.close();
                                } catch (Throwable th2) {
/* 32 */                            th.addSuppressed(th2);
                                }
                            }
/* 35 */                    throw th;
                        }
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
                public void onNewIntent(Intent intent) {
/* 5 */             if (!isAttachedToActivity()) {
/* 40 */                Log.m4585e(TAG, "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
/* 43 */                return;
                    }
/* 9 */             TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#onNewIntent");
                    try {
/* 15 */                this.activityPluginBinding.onNewIntent(intent);
/* 18 */                if (traceSectionScoped != null) {
/* 20 */                    traceSectionScoped.close();
                        }
                    } catch (Throwable th) {
/* 25 */                if (traceSectionScoped != null) {
                            try {
/* 27 */                        traceSectionScoped.close();
                            } catch (Throwable th2) {
/* 32 */                        th.addSuppressed(th2);
                            }
                        }
/* 35 */                throw th;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
                public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
/* 5 */             if (!isAttachedToActivity()) {
/* 41 */                Log.m4585e(TAG, "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
/* 44 */                return false;
                    }
/* 9 */             TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
                    try {
/* 15 */                boolean zOnRequestPermissionsResult = this.activityPluginBinding.onRequestPermissionsResult(i, strArr, iArr);
/* 19 */                if (traceSectionScoped != null) {
/* 21 */                    traceSectionScoped.close();
                        }
/* 24 */                return zOnRequestPermissionsResult;
                    } catch (Throwable th) {
/* 26 */                if (traceSectionScoped != null) {
                            try {
/* 28 */                        traceSectionScoped.close();
                            } catch (Throwable th2) {
/* 33 */                        th.addSuppressed(th2);
                            }
                        }
/* 36 */                throw th;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
                public void onRestoreInstanceState(Bundle bundle) {
/* 5 */             if (!isAttachedToActivity()) {
/* 40 */                Log.m4585e(TAG, "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
/* 43 */                return;
                    }
/* 9 */             TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                    try {
/* 15 */                this.activityPluginBinding.onRestoreInstanceState(bundle);
/* 18 */                if (traceSectionScoped != null) {
/* 20 */                    traceSectionScoped.close();
                        }
                    } catch (Throwable th) {
/* 25 */                if (traceSectionScoped != null) {
                            try {
/* 27 */                        traceSectionScoped.close();
                            } catch (Throwable th2) {
/* 32 */                        th.addSuppressed(th2);
                            }
                        }
/* 35 */                throw th;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
                public void onSaveInstanceState(Bundle bundle) {
/* 5 */             if (!isAttachedToActivity()) {
/* 40 */                Log.m4585e(TAG, "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
/* 43 */                return;
                    }
/* 9 */             TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#onSaveInstanceState");
                    try {
/* 15 */                this.activityPluginBinding.onSaveInstanceState(bundle);
/* 18 */                if (traceSectionScoped != null) {
/* 20 */                    traceSectionScoped.close();
                        }
                    } catch (Throwable th) {
/* 25 */                if (traceSectionScoped != null) {
                            try {
/* 27 */                        traceSectionScoped.close();
                            } catch (Throwable th2) {
/* 32 */                        th.addSuppressed(th2);
                            }
                        }
/* 35 */                throw th;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
                public void onUserLeaveHint() {
/* 5 */             if (!isAttachedToActivity()) {
/* 40 */                Log.m4585e(TAG, "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
/* 43 */                return;
                    }
/* 9 */             TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#onUserLeaveHint");
                    try {
/* 15 */                this.activityPluginBinding.onUserLeaveHint();
/* 18 */                if (traceSectionScoped != null) {
/* 20 */                    traceSectionScoped.close();
                        }
                    } catch (Throwable th) {
/* 25 */                if (traceSectionScoped != null) {
                            try {
/* 27 */                        traceSectionScoped.close();
                            } catch (Throwable th2) {
/* 32 */                        th.addSuppressed(th2);
                            }
                        }
/* 35 */                throw th;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.PluginRegistry
                public void remove(Class<? extends FlutterPlugin> cls) {
/* 3 */             FlutterPlugin flutterPlugin = this.plugins.get(cls);
/* 9 */             if (flutterPlugin == null) {
/* 129 */               return;
                    }
/* 23 */            TraceSection traceSectionScoped = TraceSection.scoped("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                    try {
/* 29 */                if (flutterPlugin instanceof ActivityAware) {
/* 35 */                    if (isAttachedToActivity()) {
/* 40 */                        ((ActivityAware) flutterPlugin).onDetachedFromActivity();
                            }
/* 48 */                    this.activityAwarePlugins.remove(cls);
                        }
/* 53 */                if (flutterPlugin instanceof ServiceAware) {
/* 59 */                    if (isAttachedToService()) {
/* 64 */                        ((ServiceAware) flutterPlugin).onDetachedFromService();
                            }
/* 69 */                    this.serviceAwarePlugins.remove(cls);
                        }
/* 74 */                if (flutterPlugin instanceof BroadcastReceiverAware) {
/* 80 */                    if (isAttachedToBroadcastReceiver()) {
/* 85 */                        ((BroadcastReceiverAware) flutterPlugin).onDetachedFromBroadcastReceiver();
                            }
/* 90 */                    this.broadcastReceiverAwarePlugins.remove(cls);
                        }
/* 95 */                if (flutterPlugin instanceof ContentProviderAware) {
/* 101 */                   if (isAttachedToContentProvider()) {
/* 106 */                       ((ContentProviderAware) flutterPlugin).onDetachedFromContentProvider();
                            }
/* 111 */                   this.contentProviderAwarePlugins.remove(cls);
                        }
/* 116 */               flutterPlugin.onDetachedFromEngine(this.pluginBinding);
/* 121 */               this.plugins.remove(cls);
/* 124 */               if (traceSectionScoped != null) {
/* 126 */                   traceSectionScoped.close();
                        }
                    } catch (Throwable th) {
/* 130 */               if (traceSectionScoped != null) {
                            try {
/* 132 */                       traceSectionScoped.close();
                            } catch (Throwable th2) {
/* 137 */                       th.addSuppressed(th2);
                            }
                        }
/* 140 */               throw th;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.PluginRegistry
                public void removeAll() {
/* 12 */            remove(new HashSet(this.plugins.keySet()));
/* 17 */            this.plugins.clear();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 6 */         public static class DefaultFlutterAssets implements FlutterPlugin.FlutterAssets {
                    final FlutterLoader flutterLoader;

                    private DefaultFlutterAssets(FlutterLoader flutterLoader) {
/* 4 */                 this.flutterLoader = flutterLoader;
                    }

                    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets
                    public String getAssetFilePathByName(String str) {
/* 3 */                 return this.flutterLoader.getLookupKeyForAsset(str);
                    }

                    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets
                    public String getAssetFilePathBySubpath(String str) {
/* 3 */                 return this.flutterLoader.getLookupKeyForAsset(str);
                    }

                    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets
/* 7 */             public String getAssetFilePathByName(String str, String str2) {
/* 8 */                 return this.flutterLoader.getLookupKeyForAsset(str, str2);
                    }

                    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets
/* 7 */             public String getAssetFilePathBySubpath(String str, String str2) {
/* 8 */                 return this.flutterLoader.getLookupKeyForAsset(str, str2);
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.PluginRegistry
/* 140 */       public void remove(Set<Class<? extends FlutterPlugin>> set) {
/* 141 */           Iterator<Class<? extends FlutterPlugin>> it = set.iterator();
                    while (it.hasNext()) {
/* 142 */               remove(it.next());
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.PluginRegistry
/* 227 */       public void add(Set<FlutterPlugin> set) {
/* 228 */           Iterator<FlutterPlugin> it = set.iterator();
                    while (it.hasNext()) {
/* 229 */               add(it.next());
                    }
                }
            }
