.class public Lcom/xlammod/lab/GateSuccess;
.super Ljava/lang/Object;
.implements Ljava/lang/Runnable;
.field private activity:Landroid/app/Activity;
.method public constructor <init>(Landroid/app/Activity;)V
 .locals 0
 invoke-direct {p0}, Ljava/lang/Object;-><init>()V
 iput-object p1, p0, Lcom/xlammod/lab/GateSuccess;->activity:Landroid/app/Activity;
 return-void
.end method
.method public run()V
 .locals 5
 :try_start
 iget-object v0, p0, Lcom/xlammod/lab/GateSuccess;->activity:Landroid/app/Activity;
 invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
 move-result-object v1
 const-string v2, "onGateSuccess"
 const/4 v3, 0x0
 new-array v4, v3, [Ljava/lang/Class;
 invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
 move-result-object v1
 const/4 v2, 0x1
 invoke-virtual {v1, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V
 new-array v4, v3, [Ljava/lang/Object;
 invoke-virtual {v1, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
 :try_end
 return-void
 .catch Ljava/lang/Throwable; {:try_start .. :try_end} :failed
 :failed
 move-exception v0
 const-string v1, "xlamMODLab"
 const-string v2, "Gate callback failed"
 invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
 return-void
.end method
