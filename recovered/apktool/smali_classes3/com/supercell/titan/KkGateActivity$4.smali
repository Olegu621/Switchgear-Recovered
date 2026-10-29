.class Lcom/supercell/titan/KkGateActivity$4;
.super Ljava/lang/Object;
.source "KkGateActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/supercell/titan/KkGateActivity;->publishFailure(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/supercell/titan/KkGateActivity;

.field final synthetic val$status:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/supercell/titan/KkGateActivity;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 101
    iput-object p1, p0, Lcom/supercell/titan/KkGateActivity$4;->this$0:Lcom/supercell/titan/KkGateActivity;

    iput-object p2, p0, Lcom/supercell/titan/KkGateActivity$4;->val$status:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 103
    iget-object v0, p0, Lcom/supercell/titan/KkGateActivity$4;->this$0:Lcom/supercell/titan/KkGateActivity;

    iget-object v1, p0, Lcom/supercell/titan/KkGateActivity$4;->val$status:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/supercell/titan/KkGateActivity;->onGateFailure(Ljava/lang/String;)V

    .line 104
    return-void
.end method
