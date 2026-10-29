.class public final Lmc2;
.super Ld10;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Lpc2;

.field public b:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

.field public c:Ljava/lang/Object;

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lpc2;

.field public i:I


# direct methods
.method public constructor <init>(Lpc2;Ld10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmc2;->f:Lpc2;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ld10;-><init>(Lc10;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iput-object p1, p0, Lmc2;->e:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lmc2;->i:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lmc2;->i:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, Lmc2;->f:Lpc2;

    .line 13
    .line 14
    invoke-virtual {v1, p1, p1, v0, p0}, Lpc2;->a(Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;ZLd10;)Ljava/io/Serializable;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
