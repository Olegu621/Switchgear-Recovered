.class public final Lcom/supercell/titan/KkProgressBridge;
.super Ljava/lang/Object;
.source "KkProgressBridge.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/supercell/titan/KkProgressBridge$Callback;
    }
.end annotation


# static fields
.field private static final CALLBACK:Lcom/supercell/titan/KkProgressBridge$Callback;

.field private static action:I

.field private static dialogId:I

.field private static message:Ljava/lang/String;

.field public static volatile q:I

.field private static scheduled:Z

.field private static title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 23
    new-instance v0, Lcom/supercell/titan/KkProgressBridge$Callback;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/supercell/titan/KkProgressBridge$Callback;-><init>(Lcom/supercell/titan/KkProgressBridge$1;)V

    sput-object v0, Lcom/supercell/titan/KkProgressBridge;->CALLBACK:Lcom/supercell/titan/KkProgressBridge$Callback;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$100()V
    .locals 0

    .line 15
    invoke-static {}, Lcom/supercell/titan/KkProgressBridge;->refresh()V

    return-void
.end method

.method static synthetic access$200()V
    .locals 0

    .line 15
    invoke-static {}, Lcom/supercell/titan/KkProgressBridge;->click()V

    return-void
.end method

.method private static declared-synchronized click()V
    .locals 4

    const-class v0, Lcom/supercell/titan/KkProgressBridge;

    monitor-enter v0

    .line 135
    :try_start_0
    sget v1, Lcom/supercell/titan/KkProgressBridge;->action:I

    const/4 v2, 0x3

    const/4 v3, 0x4

    if-ne v1, v2, :cond_0

    .line 136
    sput v3, Lcom/supercell/titan/KkProgressBridge;->q:I

    goto :goto_0

    .line 137
    :cond_0
    sget v1, Lcom/supercell/titan/KkProgressBridge;->action:I

    if-ne v1, v3, :cond_1

    .line 138
    const/4 v1, 0x5

    sput v1, Lcom/supercell/titan/KkProgressBridge;->q:I

    goto :goto_0

    .line 140
    :cond_1
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    invoke-static {v1}, Landroid/os/Process;->killProcess(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    :goto_0
    monitor-exit v0

    return-void

    .line 134
    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static dismissAll(Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 67
    :try_start_0
    const-string v0, "nativeDialogDismissAll"

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {p0, v0, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    .line 68
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 69
    new-array v0, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    goto :goto_0

    .line 70
    :catchall_0
    move-exception p0

    .line 72
    :goto_0
    return-void
.end method

.method private static dismissRestoredFragment()V
    .locals 4

    .line 121
    :try_start_0
    const-string v0, "com.supercell.titan.GameApp"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 122
    const-string v1, "getInstance"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 123
    new-array v1, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 124
    instance-of v1, v0, Landroid/app/Activity;

    if-nez v1, :cond_0

    .line 125
    return-void

    .line 126
    :cond_0
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    const-string v1, "NativeDialog"

    .line 127
    invoke-virtual {v0, v1}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v0

    .line 128
    instance-of v1, v0, Landroid/app/DialogFragment;

    if-eqz v1, :cond_1

    .line 129
    check-cast v0, Landroid/app/DialogFragment;

    invoke-virtual {v0}, Landroid/app/DialogFragment;->dismissAllowingStateLoss()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    :cond_1
    goto :goto_0

    .line 130
    :catchall_0
    move-exception v0

    .line 132
    :goto_0
    return-void
.end method

.method private static intField(Ljava/lang/Object;Ljava/lang/String;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    .line 61
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 62
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static declared-synchronized p(ILjava/lang/String;Ljava/lang/String;I)V
    .locals 3

    const-class v0, Lcom/supercell/titan/KkProgressBridge;

    monitor-enter v0

    .line 31
    :try_start_0
    sget-boolean v1, Lcom/supercell/titan/KkProgressBridge;->scheduled:Z

    if-eqz v1, :cond_0

    sget v1, Lcom/supercell/titan/KkProgressBridge;->action:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    if-eq p3, v2, :cond_0

    .line 32
    monitor-exit v0

    return-void

    .line 33
    :cond_0
    const/4 v1, 0x0

    :try_start_1
    sput v1, Lcom/supercell/titan/KkProgressBridge;->q:I

    .line 34
    sput p0, Lcom/supercell/titan/KkProgressBridge;->dialogId:I

    .line 35
    sput-object p1, Lcom/supercell/titan/KkProgressBridge;->title:Ljava/lang/String;

    .line 36
    sput-object p2, Lcom/supercell/titan/KkProgressBridge;->message:Ljava/lang/String;

    .line 37
    sput p3, Lcom/supercell/titan/KkProgressBridge;->action:I

    .line 38
    sget-boolean p0, Lcom/supercell/titan/KkProgressBridge;->scheduled:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz p0, :cond_1

    .line 39
    monitor-exit v0

    return-void

    .line 41
    :cond_1
    :try_start_2
    const-string p0, "com.supercell.titan.GameApp"

    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    .line 42
    const-string p1, "getInstance"

    new-array p2, v1, [Ljava/lang/Class;

    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    .line 43
    new-array p1, v1, [Ljava/lang/Object;

    const/4 p2, 0x0

    invoke-virtual {p0, p2, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 44
    instance-of p1, p0, Landroid/app/Activity;

    if-eqz p1, :cond_2

    .line 45
    const/4 p1, 0x1

    sput-boolean p1, Lcom/supercell/titan/KkProgressBridge;->scheduled:Z

    .line 46
    check-cast p0, Landroid/app/Activity;

    sget-object p1, Lcom/supercell/titan/KkProgressBridge;->CALLBACK:Lcom/supercell/titan/KkProgressBridge$Callback;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 49
    :cond_2
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p0

    .line 50
    :goto_0
    monitor-exit v0

    return-void

    .line 30
    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private static declared-synchronized refresh()V
    .locals 7

    const-class v0, Lcom/supercell/titan/KkProgressBridge;

    monitor-enter v0

    .line 75
    const/4 v1, 0x0

    :try_start_0
    sput-boolean v1, Lcom/supercell/titan/KkProgressBridge;->scheduled:Z

    .line 76
    sget v2, Lcom/supercell/titan/KkProgressBridge;->action:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 78
    :try_start_1
    const-string v3, "com.supercell.titan.NativeDialogManager"

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 81
    const-string v4, "d"

    invoke-static {v3, v4}, Lcom/supercell/titan/KkProgressBridge;->staticField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 82
    const/4 v5, 0x2

    const/4 v6, 0x3

    if-ne v2, v5, :cond_0

    .line 83
    invoke-static {v3}, Lcom/supercell/titan/KkProgressBridge;->dismissAll(Ljava/lang/Class;)V

    .line 84
    invoke-static {}, Lcom/supercell/titan/KkProgressBridge;->dismissRestoredFragment()V

    .line 85
    sput v6, Lcom/supercell/titan/KkProgressBridge;->q:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    monitor-exit v0

    return-void

    .line 88
    :cond_0
    :try_start_2
    instance-of v3, v4, Landroid/app/DialogFragment;

    if-eqz v3, :cond_8

    const-string v3, "a"

    .line 89
    invoke-static {v4, v3}, Lcom/supercell/titan/KkProgressBridge;->intField(Ljava/lang/Object;Ljava/lang/String;)I

    move-result v3

    sget v5, Lcom/supercell/titan/KkProgressBridge;->dialogId:I

    if-eq v3, v5, :cond_1

    goto :goto_3

    .line 91
    :cond_1
    check-cast v4, Landroid/app/DialogFragment;

    invoke-virtual {v4}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object v3

    .line 92
    instance-of v4, v3, Landroid/app/AlertDialog;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v4, :cond_2

    .line 93
    monitor-exit v0

    return-void

    .line 94
    :cond_2
    :try_start_3
    check-cast v3, Landroid/app/AlertDialog;

    .line 95
    sget-object v4, Lcom/supercell/titan/KkProgressBridge;->title:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 96
    sget-object v4, Lcom/supercell/titan/KkProgressBridge;->message:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 97
    const/4 v4, -0x3

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 98
    if-nez v3, :cond_3

    .line 99
    monitor-exit v0

    return-void

    .line 100
    :cond_3
    const/4 v4, 0x1

    if-eq v2, v6, :cond_6

    const/4 v5, 0x4

    if-ne v2, v5, :cond_4

    goto :goto_0

    .line 104
    :cond_4
    if-ne v2, v4, :cond_5

    .line 105
    :try_start_4
    sget-object v2, Lcom/supercell/titan/KkProgressBridge;->CALLBACK:Lcom/supercell/titan/KkProgressBridge$Callback;

    invoke-virtual {v3, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 106
    const-string v2, "Close the app"

    invoke-virtual {v3, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 107
    invoke-virtual {v3, v1}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_2

    .line 109
    :cond_5
    const-string v1, ""

    invoke-virtual {v3, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 110
    const/16 v1, 0x8

    invoke-virtual {v3, v1}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_2

    .line 101
    :cond_6
    :goto_0
    sget-object v5, Lcom/supercell/titan/KkProgressBridge;->CALLBACK:Lcom/supercell/titan/KkProgressBridge$Callback;

    invoke-virtual {v3, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 102
    if-ne v2, v6, :cond_7

    const-string v2, "Pause"

    goto :goto_1

    :cond_7
    const-string v2, "Resume"

    :goto_1
    invoke-virtual {v3, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 103
    invoke-virtual {v3, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 112
    :goto_2
    sput v4, Lcom/supercell/titan/KkProgressBridge;->q:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 114
    goto :goto_4

    .line 90
    :cond_8
    :goto_3
    monitor-exit v0

    return-void

    .line 113
    :catchall_0
    move-exception v1

    .line 115
    :goto_4
    monitor-exit v0

    return-void

    .line 74
    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static staticField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 54
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    .line 55
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 56
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
