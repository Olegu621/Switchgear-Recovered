.class public abstract Lcom/quago/mobile/sdk/t0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/util/HashMap;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/quago/mobile/sdk/x0;

.field public d:J

.field public e:J

.field public f:J

.field public g:J

.field public final h:Ljava/lang/String;

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Z


# direct methods
.method public constructor <init>(Lcom/quago/mobile/sdk/x0;ZZ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p1, Lcom/quago/mobile/sdk/x0;->b:J

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/quago/mobile/sdk/t0;->f:J

    .line 7
    .line 8
    const-string v0, "POST"

    .line 9
    .line 10
    iput-object v0, p0, Lcom/quago/mobile/sdk/t0;->h:Ljava/lang/String;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/quago/mobile/sdk/t0;->a:Ljava/util/HashMap;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lcom/quago/mobile/sdk/t0;->i:Z

    .line 21
    .line 22
    iput-boolean p3, p0, Lcom/quago/mobile/sdk/t0;->l:Z

    .line 23
    .line 24
    const/4 p3, 0x1

    .line 25
    iput-boolean p3, p0, Lcom/quago/mobile/sdk/t0;->k:Z

    .line 26
    .line 27
    iput-boolean p2, p0, Lcom/quago/mobile/sdk/t0;->j:Z

    .line 28
    .line 29
    iget-object p2, p1, Lcom/quago/mobile/sdk/x0;->a:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p2, p0, Lcom/quago/mobile/sdk/t0;->b:Ljava/lang/String;

    .line 32
    .line 33
    iput-object p1, p0, Lcom/quago/mobile/sdk/t0;->c:Lcom/quago/mobile/sdk/x0;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method
