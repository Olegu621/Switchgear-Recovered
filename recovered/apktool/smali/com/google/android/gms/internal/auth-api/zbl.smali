.class public final Lcom/google/android/gms/internal/auth-api/zbl;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final delete(Ltr0;Lcom/google/android/gms/auth/api/credentials/Credential;)Lsr1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Lcom/google/android/gms/auth/api/credentials/Credential;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 1
    const-string v0, "client must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "credential must not be null"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/google/android/gms/internal/auth-api/zbi;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/auth-api/zbi;-><init>(Lcom/google/android/gms/internal/auth-api/zbl;Ltr0;Lcom/google/android/gms/auth/api/credentials/Credential;)V

    .line 14
    .line 15
    .line 16
    check-cast p1, Leb3;

    .line 17
    .line 18
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lgi;)Lgi;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final disableAutoSignIn(Ltr0;)Lsr1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 1
    const-string v0, "client must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/google/android/gms/internal/auth-api/zbj;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/auth-api/zbj;-><init>(Lcom/google/android/gms/internal/auth-api/zbl;Ltr0;)V

    .line 9
    .line 10
    .line 11
    check-cast p1, Leb3;

    .line 12
    .line 13
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lgi;)Lgi;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final getHintPickerIntent(Ltr0;Lcom/google/android/gms/auth/api/credentials/HintRequest;)Landroid/app/PendingIntent;
    .locals 0

    .line 1
    const-string p0, "client must not be null"

    .line 2
    .line 3
    invoke-static {p1, p0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p0, "request must not be null"

    .line 7
    .line 8
    invoke-static {p2, p0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lce;->a:Lh9;

    .line 12
    .line 13
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 16
    .line 17
    .line 18
    throw p0
.end method

.method public final request(Ltr0;Lcom/google/android/gms/auth/api/credentials/CredentialRequest;)Lsr1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Lcom/google/android/gms/auth/api/credentials/CredentialRequest;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 1
    const-string v0, "client must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "request must not be null"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/google/android/gms/internal/auth-api/zbg;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/auth-api/zbg;-><init>(Lcom/google/android/gms/internal/auth-api/zbl;Ltr0;Lcom/google/android/gms/auth/api/credentials/CredentialRequest;)V

    .line 14
    .line 15
    .line 16
    check-cast p1, Leb3;

    .line 17
    .line 18
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lor0;->doRead(Lgi;)Lgi;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final save(Ltr0;Lcom/google/android/gms/auth/api/credentials/Credential;)Lsr1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Lcom/google/android/gms/auth/api/credentials/Credential;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 1
    const-string v0, "client must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "credential must not be null"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/google/android/gms/internal/auth-api/zbh;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/auth-api/zbh;-><init>(Lcom/google/android/gms/internal/auth-api/zbl;Ltr0;Lcom/google/android/gms/auth/api/credentials/Credential;)V

    .line 14
    .line 15
    .line 16
    check-cast p1, Leb3;

    .line 17
    .line 18
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lgi;)Lgi;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method
