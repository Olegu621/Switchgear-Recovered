.class Lcom/supercell/titan/KkRestartActivity$1;
.super Ljava/lang/Object;
.source "KkRestartActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/supercell/titan/KkRestartActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/supercell/titan/KkRestartActivity;


# direct methods
.method constructor <init>(Lcom/supercell/titan/KkRestartActivity;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/supercell/titan/KkRestartActivity$1;->this$0:Lcom/supercell/titan/KkRestartActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 26
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.MAIN"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 27
    const-string v1, "android.intent.category.LAUNCHER"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 28
    iget-object v1, p0, Lcom/supercell/titan/KkRestartActivity$1;->this$0:Lcom/supercell/titan/KkRestartActivity;

    const-class v2, Lcom/supercell/titan/KkGateActivity;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 29
    const v1, 0x10008000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 31
    iget-object v1, p0, Lcom/supercell/titan/KkRestartActivity$1;->this$0:Lcom/supercell/titan/KkRestartActivity;

    invoke-virtual {v1, v0}, Lcom/supercell/titan/KkRestartActivity;->startActivity(Landroid/content/Intent;)V

    .line 32
    iget-object v0, p0, Lcom/supercell/titan/KkRestartActivity$1;->this$0:Lcom/supercell/titan/KkRestartActivity;

    invoke-virtual {v0}, Lcom/supercell/titan/KkRestartActivity;->finishAndRemoveTask()V

    .line 33
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    .line 34
    return-void
.end method
