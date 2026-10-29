.class public final Lcom/supercell/titan/KkGateActivity;
.super Landroid/app/Activity;
.source "KkGateActivity.java"


# static fields
.field private static final DIAGNOSTICS:Z = false

.field public static volatile foregroundHandoffPending:Z


# instance fields
.field private gateStarted:Z

.field private terminalUi:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/supercell/titan/KkGateActivity;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/supercell/titan/KkGateActivity;->runGate()V

    return-void
.end method

.method static synthetic access$100(Lcom/supercell/titan/KkGateActivity;)Z
    .locals 0

    .line 15
    iget-boolean p0, p0, Lcom/supercell/titan/KkGateActivity;->terminalUi:Z

    return p0
.end method

.method private static baseLibrariesLoaded()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 53
    const-string v0, "com.supercell.titan.TitanApplication"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 54
    const-string v1, "nativeBaseLibrariesLoaded"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 55
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 56
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private publishFailure(Ljava/lang/String;)V
    .locals 1

    .line 101
    new-instance v0, Lcom/supercell/titan/KkGateActivity$4;

    invoke-direct {v0, p0, p1}, Lcom/supercell/titan/KkGateActivity$4;-><init>(Lcom/supercell/titan/KkGateActivity;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/supercell/titan/KkGateActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 106
    return-void
.end method

.method private runGate()V
    .locals 3

    .line 60
    const-string v0, "-14"

    .line 62
    :try_start_0
    invoke-static {}, Lcom/supercell/titan/KkGateActivity;->baseLibrariesLoaded()Z

    move-result v1

    .line 64
    if-nez v1, :cond_0

    .line 65
    invoke-direct {p0, v0}, Lcom/supercell/titan/KkGateActivity;->publishFailure(Ljava/lang/String;)V

    .line 66
    return-void

    .line 69
    :cond_0
    invoke-static {p0}, Lzap/m;->start(Landroid/content/Context;)Z

    move-result v1

    .line 71
    if-nez v1, :cond_1

    .line 72
    invoke-direct {p0, v0}, Lcom/supercell/titan/KkGateActivity;->publishFailure(Ljava/lang/String;)V

    .line 73
    return-void

    .line 76
    :cond_1
    :goto_0
    const-string v1, "R8v3N2q7"

    invoke-static {v1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 77
    if-eqz v1, :cond_2

    const-string v2, "-100"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 78
    nop

    .line 80
    nop

    .line 87
    move-object v0, v1

    goto :goto_1

    .line 82
    :cond_2
    const-wide/16 v1, 0x32

    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    goto :goto_0

    .line 84
    :catchall_0
    move-exception v1

    .line 89
    :goto_1
    nop

    .line 90
    new-instance v1, Lcom/supercell/titan/KkGateActivity$3;

    invoke-direct {v1, p0, v0}, Lcom/supercell/titan/KkGateActivity$3;-><init>(Lcom/supercell/titan/KkGateActivity;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/supercell/titan/KkGateActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 98
    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 0

    .line 27
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 31
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 33
    new-instance p1, Landroid/view/View;

    invoke-direct {p1, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 34
    const/high16 v0, -0x1000000

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 35
    invoke-virtual {p0, p1}, Lcom/supercell/titan/KkGateActivity;->setContentView(Landroid/view/View;)V

    .line 36
    iget-boolean p1, p0, Lcom/supercell/titan/KkGateActivity;->gateStarted:Z

    if-eqz p1, :cond_0

    .line 37
    return-void

    .line 38
    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/supercell/titan/KkGateActivity;->gateStarted:Z

    .line 39
    new-instance p1, Ljava/lang/Thread;

    new-instance v0, Lcom/supercell/titan/KkGateActivity$1;

    invoke-direct {v0, p0}, Lcom/supercell/titan/KkGateActivity$1;-><init>(Lcom/supercell/titan/KkGateActivity;)V

    const-string v1, "fusion-start"

    invoke-direct {p1, v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 43
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 44
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lcom/supercell/titan/KkGateActivity$2;

    invoke-direct {v0, p0}, Lcom/supercell/titan/KkGateActivity$2;-><init>(Lcom/supercell/titan/KkGateActivity;)V

    const-wide/32 v1, 0xafc8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 50
    return-void
.end method

.method public onGateFailure(Ljava/lang/String;)V
    .locals 1

    .line 109
    iget-boolean v0, p0, Lcom/supercell/titan/KkGateActivity;->terminalUi:Z

    if-eqz v0, :cond_0

    .line 110
    return-void

    .line 113
    :cond_0
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    .line 116
    const/16 v0, -0xd

    if-lt p1, v0, :cond_1

    const/4 v0, -0x1

    if-gt p1, v0, :cond_1

    .line 117
    invoke-virtual {p0}, Lcom/supercell/titan/KkGateActivity;->onGateSuccess()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    return-void

    .line 121
    :cond_1
    goto :goto_0

    .line 120
    :catchall_0
    move-exception p1

    .line 122
    :goto_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/supercell/titan/KkGateActivity;->terminalUi:Z

    .line 123
    invoke-virtual {p0}, Lcom/supercell/titan/KkGateActivity;->finishAndRemoveTask()V

    .line 124
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result p1

    invoke-static {p1}, Landroid/os/Process;->killProcess(I)V

    .line 125
    return-void
.end method

.method public onGateSuccess()V
    .locals 7

    .line 128
    iget-boolean v0, p0, Lcom/supercell/titan/KkGateActivity;->terminalUi:Z

    if-eqz v0, :cond_0

    .line 129
    return-void

    .line 132
    :cond_0
    const/4 v0, 0x1

    :try_start_0
    const-string v1, "com.supercell.titan.TitanApplication"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 133
    const-string v2, "nativeLibrariesLoaded"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 134
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 135
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 136
    invoke-virtual {v2, v3, v0}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V

    .line 137
    const-string v2, "nOnNativeLibrariesLoaded"

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Class;

    invoke-virtual {v1, v2, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 138
    const-string v5, "nOnApplicationCreate"

    new-array v6, v4, [Ljava/lang/Class;

    invoke-virtual {v1, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 139
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 140
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 141
    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    new-array v2, v4, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    :cond_1
    iput-boolean v0, p0, Lcom/supercell/titan/KkGateActivity;->terminalUi:Z

    .line 146
    sput-boolean v0, Lcom/supercell/titan/KkGateActivity;->foregroundHandoffPending:Z

    .line 147
    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/supercell/titan/KkGateActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 148
    const-string v2, "com.supercell.brawlstars.GameApp"

    invoke-virtual {v1, p0, v2}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 149
    invoke-virtual {p0, v1}, Lcom/supercell/titan/KkGateActivity;->startActivity(Landroid/content/Intent;)V

    .line 150
    invoke-virtual {p0}, Lcom/supercell/titan/KkGateActivity;->finish()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    goto :goto_0

    .line 151
    :catchall_0
    move-exception v1

    .line 153
    iput-boolean v0, p0, Lcom/supercell/titan/KkGateActivity;->terminalUi:Z

    .line 154
    invoke-virtual {p0}, Lcom/supercell/titan/KkGateActivity;->finishAndRemoveTask()V

    .line 155
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    .line 157
    :goto_0
    return-void
.end method
