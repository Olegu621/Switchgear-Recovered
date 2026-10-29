.class Lcom/supercell/titan/KkGateActivity$1;
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

    .line 39
    iput-object p1, p0, Lcom/supercell/titan/KkGateActivity$1;->this$0:Lcom/supercell/titan/KkGateActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/supercell/titan/KkGateActivity$1;->this$0:Lcom/supercell/titan/KkGateActivity;

    invoke-static {v0}, Lcom/supercell/titan/KkGateActivity;->access$000(Lcom/supercell/titan/KkGateActivity;)V

    .line 42
    return-void
.end method
