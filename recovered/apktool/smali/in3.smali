.class public final Lin3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lb9;
.implements Lz8;


# instance fields
.field public final a:I

.field public final b:Ljava/util/ArrayList;

.field public final c:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

.field public final d:Ljava/lang/String;

.field public final e:Lnl3;


# direct methods
.method public synthetic constructor <init>(ILjava/util/ArrayList;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Ljava/lang/String;Lnl3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lin3;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lin3;->b:Ljava/util/ArrayList;

    .line 7
    .line 8
    iput-object p3, p0, Lin3;->c:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 9
    .line 10
    iput-object p4, p0, Lin3;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lin3;->e:Lnl3;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lin3;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_1
    check-cast p1, Lin3;

    .line 10
    .line 11
    iget v0, p0, Lin3;->a:I

    .line 12
    .line 13
    iget v1, p1, Lin3;->a:I

    .line 14
    .line 15
    if-ne v0, v1, :cond_4

    .line 16
    .line 17
    iget-object v0, p0, Lin3;->b:Ljava/util/ArrayList;

    .line 18
    .line 19
    iget-object v1, p1, Lin3;->b:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_4

    .line 26
    .line 27
    iget-object v0, p1, Lin3;->c:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 28
    .line 29
    iget-object v1, p0, Lin3;->c:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    if-nez v0, :cond_4

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-virtual {v1, v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_3

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_3
    :goto_0
    const/4 v0, 0x0

    .line 44
    invoke-static {v0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    iget-object p0, p0, Lin3;->d:Ljava/lang/String;

    .line 51
    .line 52
    iget-object p1, p1, Lin3;->d:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {p0, p1}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_4

    .line 59
    .line 60
    :goto_1
    const/4 p0, 0x1

    .line 61
    return p0

    .line 62
    :cond_4
    :goto_2
    const/4 p0, 0x0

    .line 63
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lin3;->a:I

    .line 2
    .line 3
    const v1, 0x1d0316bf

    .line 4
    .line 5
    .line 6
    add-int/2addr v0, v1

    .line 7
    mul-int/lit16 v0, v0, 0x3c1

    .line 8
    .line 9
    iget-object v1, p0, Lin3;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    const v0, 0xe1781

    .line 17
    .line 18
    .line 19
    mul-int/2addr v1, v0

    .line 20
    const/4 v0, 0x0

    .line 21
    iget-object v2, p0, Lin3;->c:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    move v2, v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    :goto_0
    add-int/2addr v1, v2

    .line 32
    mul-int/lit16 v1, v1, 0x745f

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x9

    .line 35
    .line 36
    mul-int/lit8 v1, v1, 0x1f

    .line 37
    .line 38
    iget-object p0, p0, Lin3;->d:Ljava/lang/String;

    .line 39
    .line 40
    if-nez p0, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    :goto_1
    add-int/2addr v1, v0

    .line 48
    return v1
.end method
