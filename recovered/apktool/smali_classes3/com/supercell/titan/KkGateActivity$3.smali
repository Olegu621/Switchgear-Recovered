.class Lcom/supercell/titan/KkGateActivity$3;
.super Ljava/lang/Object;
.source "KkGateActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/supercell/titan/KkGateActivity;->runGate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/supercell/titan/KkGateActivity;

.field final synthetic val$result:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/supercell/titan/KkGateActivity;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 90
    iput-object p1, p0, Lcom/supercell/titan/KkGateActivity$3;->this$0:Lcom/supercell/titan/KkGateActivity;

    iput-object p2, p0, Lcom/supercell/titan/KkGateActivity$3;->val$result:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 92
    const-string v0, "0"

    iget-object v1, p0, Lcom/supercell/titan/KkGateActivity$3;->val$result:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    iget-object v0, p0, Lcom/supercell/titan/KkGateActivity$3;->this$0:Lcom/supercell/titan/KkGateActivity;

    invoke-virtual {v0}, Lcom/supercell/titan/KkGateActivity;->onGateSuccess()V

    goto :goto_0

    .line 95
    :cond_0
    iget-object v0, p0, Lcom/supercell/titan/KkGateActivity$3;->this$0:Lcom/supercell/titan/KkGateActivity;

    iget-object v1, p0, Lcom/supercell/titan/KkGateActivity$3;->val$result:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/supercell/titan/KkGateActivity;->onGateFailure(Ljava/lang/String;)V

    .line 96
    :goto_0
    return-void
.end method
