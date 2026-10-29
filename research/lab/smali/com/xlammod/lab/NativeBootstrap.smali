.class public Lcom/xlammod/lab/NativeBootstrap;
.super Landroid/app/Instrumentation;

.method public constructor <init>()V
    .locals 0
    invoke-direct {p0}, Landroid/app/Instrumentation;-><init>()V
    return-void
.end method

.method public static native base()J
.end method
.method public static native read32(J)J
.end method
.method public static native put32(JI)V
.end method
.method public static native call(JJJ)J
.end method
.method public static native setupOffline()J
.end method
.method public static native stage()J
.end method
.method public static native diagnostic()Ljava/lang/String;
.end method
.method public static native bufferCount()J
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0
    invoke-super {p0, p1}, Landroid/app/Instrumentation;->onCreate(Landroid/os/Bundle;)V
    invoke-virtual {p0}, Landroid/app/Instrumentation;->start()V
    return-void
.end method

.method public callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3
    instance-of v0, p1, Lcom/supercell/titan/KkGateActivity;
    if-eqz v0, :create
    const-class v0, Lcom/supercell/titan/KkGateActivity;
    const-string v1, "terminalUi"
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
    move-result-object v0
    const/4 v1, 0x1
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V
    :create
    invoke-super {p0, p1, p2}, Landroid/app/Instrumentation;->callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;)V
    return-void
.end method

.method public onStart()V
    .locals 12
    :try_start
    invoke-virtual {p0}, Landroid/app/Instrumentation;->getTargetContext()Landroid/content/Context;
    move-result-object v0
    new-instance v2, Landroid/content/Intent;
    const-class v3, Lcom/supercell/titan/KkGateActivity;
    invoke-direct {v2, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
    const/high16 v3, 0x10000000
    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    invoke-virtual {p0, v2}, Landroid/app/Instrumentation;->startActivitySync(Landroid/content/Intent;)Landroid/app/Activity;
    move-result-object v0
    const-wide/16 v2, 0x3e8
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    invoke-static {v0}, Lzap/m;->start(Landroid/content/Context;)Z
    const-string v1, "xlamMODLab"
    const-string v2, "Activity context ready; installing local module loader"
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    const-string v2, "xlamlab"
    invoke-static {v2}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    invoke-static {}, Lcom/xlammod/lab/NativeBootstrap;->setupOffline()J
    move-result-wide v10
    invoke-static {v10, v11}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
    move-result-object v2
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    const-wide/32 v4, 0x888f50
    const/4 v6, 0x1
    invoke-static {v4, v5, v6}, Lcom/xlammod/lab/NativeBootstrap;->put32(JI)V
    const-wide/32 v4, 0x49a08
    const-wide/16 v6, 0x0
    const-wide/16 v8, 0x0
    invoke-static/range {v4 .. v9}, Lcom/xlammod/lab/NativeBootstrap;->call(JJJ)J
    move-result-wide v10
    invoke-static {v10, v11}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
    move-result-object v2
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    const/4 v7, 0x0
    :wait
    const-wide/16 v2, 0x1f4
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    invoke-static {}, Lcom/xlammod/lab/NativeBootstrap;->stage()J
    move-result-wide v10
    invoke-static {v10, v11}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
    move-result-object v2
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    invoke-static {}, Lcom/xlammod/lab/NativeBootstrap;->diagnostic()Ljava/lang/String;
    move-result-object v2
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    add-int/lit8 v7, v7, 0x1
    const/16 v8, 0x14
    if-lt v7, v8, :wait
    const-class v2, Lcom/supercell/titan/KkGateActivity;
    const-string v3, "terminalUi"
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
    move-result-object v2
    const/4 v3, 0x1
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    const/4 v3, 0x0
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V
    new-instance v2, Lcom/xlammod/lab/GateSuccess;
    invoke-direct {v2, v0}, Lcom/xlammod/lab/GateSuccess;-><init>(Landroid/app/Activity;)V
    invoke-virtual {v0, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    const-wide/32 v2, 0xea60
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end
    goto :done
    .catch Ljava/lang/Throwable; {:try_start .. :try_end} :failed
    :failed
    move-exception v0
    const-string v1, "xlamMODLab"
    const-string v2, "Offline bootstrap failed"
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :done
    new-instance v0, Landroid/os/Bundle;
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    const/4 v1, 0x0
    invoke-virtual {p0, v1, v0}, Landroid/app/Instrumentation;->finish(ILandroid/os/Bundle;)V
    return-void
.end method
