.class public final Lhb1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lbn1;

.field public final b:Lcom/usercentrics/sdk/UsercentricsDomains;


# direct methods
.method public constructor <init>(Lbn1;Lcom/usercentrics/sdk/UsercentricsDomains;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lhb1;->a:Lbn1;

    .line 8
    .line 9
    iput-object p2, p0, Lhb1;->b:Lcom/usercentrics/sdk/UsercentricsDomains;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lhb1;->b:Lcom/usercentrics/sdk/UsercentricsDomains;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/usercentrics/sdk/UsercentricsDomains;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object p0, v0, Lcom/usercentrics/sdk/UsercentricsDomains;->b:Ljava/lang/String;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Lhb1;->a:Lbn1;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    if-ne p0, v0, :cond_1

    .line 22
    .line 23
    const-string p0, "https://config.eu.usercentrics.eu"

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    invoke-static {}, Lds0;->b()V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return-object p0

    .line 31
    :cond_2
    const-string p0, "https://api.usercentrics.eu"

    .line 32
    .line 33
    return-object p0
.end method
