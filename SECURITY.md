# STOWBLI Security

STOWBLI is a self-custody wallet.

Private key material must be generated, stored, and used locally.

STOWBLI will:

- Use established cryptographic standards.
- Use Android secure storage where appropriate.
- Sign transactions locally.
- Never transmit private keys.
- Never log private keys or recovery secrets.
- Avoid custom cryptography.

Network access may be used to read blockchain data and broadcast signed transactions.

Security-sensitive features should favor established wallet standards over custom implementations.