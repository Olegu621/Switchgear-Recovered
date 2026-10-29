.class public final Lzb2;
.super Ld10;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Lac2;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lac2;

.field public d:I


# direct methods
.method public constructor <init>(Lac2;Ld10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzb2;->c:Lac2;

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
    .locals 1

    .line 1
    iput-object p1, p0, Lzb2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lzb2;->d:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lzb2;->d:I

    .line 9
    .line 10
    iget-object p1, p0, Lzb2;->c:Lac2;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lac2;->a(Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;Ld10;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, Lz10;->a:Lz10;

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    new-instance p1, Lo42;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Lo42;-><init>(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object p1
.end method
