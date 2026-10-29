.class public final Ljl1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:I

.field public final synthetic i:Lcom/supercell/titan/GameApp;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/supercell/titan/GameApp;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljl1;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ljl1;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Ljl1;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Ljl1;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Ljl1;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput p6, p0, Ljl1;->f:I

    .line 15
    .line 16
    iput-object p7, p0, Ljl1;->i:Lcom/supercell/titan/GameApp;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    new-instance v0, Lcom/supercell/titan/NativeDialogManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/supercell/titan/NativeDialogManager;-><init>()V

    .line 4
    .line 5
    .line 6
    const v1, 0x103012e

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v2, v1}, Landroid/app/DialogFragment;->setStyle(II)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v3, "title"

    .line 19
    .line 20
    iget-object v4, p0, Ljl1;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v3, "message"

    .line 26
    .line 27
    iget-object v4, p0, Ljl1;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v3, "button"

    .line 33
    .line 34
    iget-object v4, p0, Ljl1;->c:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v3, "button2"

    .line 40
    .line 41
    iget-object v4, p0, Ljl1;->d:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v3, "button3"

    .line 47
    .line 48
    iget-object v4, p0, Ljl1;->e:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v3, "id"

    .line 54
    .line 55
    iget v4, p0, Ljl1;->f:I

    .line 56
    .line 57
    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2}, Landroid/app/DialogFragment;->setCancelable(Z)V

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, Ljl1;->i:Lcom/supercell/titan/GameApp;

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    :try_start_0
    const-string v1, "NativeDialog"

    .line 73
    .line 74
    invoke-virtual {v0, p0, v1}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    sput-object v0, Lcom/supercell/titan/NativeDialogManager;->d:Lcom/supercell/titan/NativeDialogManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    return-void

    .line 80
    :catch_0
    move-exception p0

    .line 81
    invoke-static {p0}, Lcom/supercell/titan/GameApp;->debuggerException(Ljava/lang/Exception;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method
