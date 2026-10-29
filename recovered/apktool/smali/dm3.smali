.class public final Ldm3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lbm3;

.field public final synthetic b:Lbm3;

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:Llm3;


# direct methods
.method public constructor <init>(Llm3;Lbm3;Lbm3;JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ldm3;->a:Lbm3;

    .line 5
    .line 6
    iput-object p3, p0, Ldm3;->b:Lbm3;

    .line 7
    .line 8
    iput-wide p4, p0, Ldm3;->c:J

    .line 9
    .line 10
    iput-boolean p6, p0, Ldm3;->d:Z

    .line 11
    .line 12
    iput-object p1, p0, Ldm3;->e:Llm3;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-boolean v5, p0, Ldm3;->d:Z

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    iget-object v0, p0, Ldm3;->e:Llm3;

    .line 5
    .line 6
    iget-object v1, p0, Ldm3;->a:Lbm3;

    .line 7
    .line 8
    iget-object v2, p0, Ldm3;->b:Lbm3;

    .line 9
    .line 10
    iget-wide v3, p0, Ldm3;->c:J

    .line 11
    .line 12
    invoke-virtual/range {v0 .. v6}, Llm3;->J(Lbm3;Lbm3;JZLandroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
