.class Lcom/supercell/titan/KkGateActivity$2;
.super Ljava/lang/Object;
.source "KkGateActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/supercell/titan/KkGateActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/supercell/titan/KkGateActivity;


# direct methods
.method constructor <init>(Lcom/supercell/titan/KkGateActivity;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/supercell/titan/KkGateActivity$2;->this$0:Lcom/supercell/titan/KkGateActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 46
    iget-object v0, p0, Lcom/supercell/titan/KkGateActivity$2;->this$0:Lcom/supercell/titan/KkGateActivity;

    invoke-static {v0}, Lcom/supercell/titan/KkGateActivity;->access$100(Lcom/supercell/titan/KkGateActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 47
    iget-object v0, p0, Lcom/supercell/titan/KkGateActivity$2;->this$0:Lcom/supercell/titan/KkGateActivity;

    const-string v1, "-15"

    invoke-virtual {v0, v1}, Lcom/supercell/titan/KkGateActivity;->onGateFailure(Ljava/lang/String;)V

    .line 48
    :cond_0
    return-void
.end method
